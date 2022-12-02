package miu.edu.day3springdata.demo.service;

import miu.edu.day3springdata.demo.entity.Review;

import java.util.List;

public interface ReviewService {

    void save (Review review);
    List<Review> getAllReview();
    Review findById(int id);
    void deleteById(int id);
}
