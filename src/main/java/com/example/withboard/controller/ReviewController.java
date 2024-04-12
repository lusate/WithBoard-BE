package com.example.withboard.controller;


import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.dto.ReviewCreateDto;
import com.example.withboard.dto.ReviewUpdateDto;
import com.example.withboard.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;
    @PostMapping("/create/{postId}")
    public void createReview(@PathVariable Long postId, @RequestBody ReviewCreateDto reviewCreateDto) {
        reviewService.save(postId, reviewCreateDto);

    }

    @DeleteMapping("delete/{reviewId}")
    public BaseResponse<Void> deleteReview(@PathVariable Long reviewId){
        reviewService.deleteReview(reviewId);
        return BaseResponse.success();
    }

    @PutMapping("update/{reviewId}")
    public BaseResponse<Void> updateReview(@PathVariable Long reviewId, @RequestBody String content){
        reviewService.modifyReview(reviewId,content);
        return BaseResponse.success();
    }

}
