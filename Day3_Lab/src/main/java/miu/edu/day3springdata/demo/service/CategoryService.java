package miu.edu.day3springdata.demo.service;

import miu.edu.day3springdata.demo.dto.CategoryDto;
import miu.edu.day3springdata.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    void save (Category category);
    List<Category>  getAllCategories();

    Category findById(int id);
    void  deleteById(int id);
}
