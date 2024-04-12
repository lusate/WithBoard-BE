package com.example.withboard.controller;


import com.example.withboard.dto.ReviewCreateDto;
import com.example.withboard.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/reivew")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;
    @PostMapping("/create/{postId}")
    public void createReview(@PathVariable Long postId, @RequestBody ReviewCreateDto reviewCreateDto) {
        reviewService.save(postId, reviewCreateDto);

    }
}
