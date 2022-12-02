package miu.edu.day3springdata.demo.repository;

import miu.edu.day3springdata.demo.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {

}
