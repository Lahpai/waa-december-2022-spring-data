package miu.edu.day3springdata.demo.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.day3springdata.demo.entity.Review;
import miu.edu.day3springdata.demo.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public void save(@RequestBody Review review) {
        reviewService.save(review);
    }

    @GetMapping
    public List<Review> getAllReview() {
        return reviewService.getAllReview();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        reviewService.deleteById(id);
    }
}
