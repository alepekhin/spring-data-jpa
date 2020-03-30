package jpa.review;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ReviewController {

    ReviewService reviewService;
    ModelMapper modelMapper;

    public ReviewController(ReviewService reviewService, ModelMapper modelMapper) {
        this.reviewService = reviewService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/reviews/{productID}")
    public List<ReviewDTO> listReviewsByProduct(@PathVariable Long productID) throws Exception {
        List<ReviewEntity> reviews =  reviewService.getReviewList(productID);
        return reviews.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/reviews/{productID}")
    public String createReview(@RequestBody ReviewDTO reviewDTO, @PathVariable Long productID) {
        ReviewEntity reviewEntity = convertToEntity(reviewDTO);
        reviewEntity.setProductID(productID);
        reviewService.createReview(reviewEntity);
        return "OK";
    }

    private ReviewDTO convertToDto(ReviewEntity reviewEntity) {
        return modelMapper.map(reviewEntity, ReviewDTO.class);
    }

    private ReviewEntity convertToEntity(ReviewDTO reviewDTO) {
        return modelMapper.map(reviewDTO, ReviewEntity.class);
    }



}
