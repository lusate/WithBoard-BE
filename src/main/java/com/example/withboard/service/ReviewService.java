package com.example.withboard.service;

import com.example.withboard.domain.Review;
import com.example.withboard.dto.ReviewCreateDto;
import com.example.withboard.repository.PostRepository;
import com.example.withboard.repository.ReviewRepository;
import com.example.withboard.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    public void save(Long postId, ReviewCreateDto reviewCreateDto) {
        Review review = new Review();
        review.setContent(reviewCreateDto.getContent());
        review.setUser(userRepository.findUserById(reviewCreateDto.getUserId()).orElseThrow());
        review.setPost(postRepository.findPostByPostId(postId).orElseThrow());
        review.setWrite_at(LocalDateTime.now());

        reviewRepository.save(review);
    }
}
