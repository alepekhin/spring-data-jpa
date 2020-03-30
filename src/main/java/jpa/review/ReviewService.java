package jpa.review;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    ReviewRepository reviewRepository;
    ModelMapper modelMapper;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, ModelMapper modelMapper) {
        this.reviewRepository = reviewRepository;
        this.modelMapper = modelMapper;
    }

    List<ReviewEntity> getReviewList(Long productID) {
        return reviewRepository.findByProductID(productID);
    }

    void createReview(ReviewEntity reviewEntity) {
        reviewRepository.save(reviewEntity);
    }

}
