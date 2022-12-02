package miu.edu.day3springdata.demo.service;

import miu.edu.day3springdata.demo.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);
    List<Product> getAllProduct();
    void update(Product product, int id);
    Product findById(int id);
    void deleteById(int id);
}
