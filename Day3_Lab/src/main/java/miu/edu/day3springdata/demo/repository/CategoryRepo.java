package miu.edu.day3springdata.demo.repository;

import miu.edu.day3springdata.demo.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {
}
