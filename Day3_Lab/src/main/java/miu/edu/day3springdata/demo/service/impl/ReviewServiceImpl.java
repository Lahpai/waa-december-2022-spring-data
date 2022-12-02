package miu.edu.day3springdata.demo.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day3springdata.demo.entity.Review;
import miu.edu.day3springdata.demo.repository.ReviewRepo;
import miu.edu.day3springdata.demo.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public List<Review> getAllReview() {
        return (List<Review>) reviewRepo.findAll();
    }

    @Override
    public Review findById(int id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        reviewRepo.deleteById(id);
    }
}
