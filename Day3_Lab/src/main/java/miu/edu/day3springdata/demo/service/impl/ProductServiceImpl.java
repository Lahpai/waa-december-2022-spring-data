package miu.edu.day3springdata.demo.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day3springdata.demo.entity.Product;
import miu.edu.day3springdata.demo.repository.ProductRepo;
import miu.edu.day3springdata.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;


    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public void update(Product product, int id) {
        productRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
         productRepo.deleteById(id);
    }
}
