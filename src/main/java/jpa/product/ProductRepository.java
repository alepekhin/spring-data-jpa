package jpa.product;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    @Query("select p from ProductEntity p where p.name like :#{#dto.getName()}%")
    List<ProductEntity> findByNameStartsWith(ProductDTO dto);

}
