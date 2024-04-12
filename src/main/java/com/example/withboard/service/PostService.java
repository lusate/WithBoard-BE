package com.example.withboard.service;

import com.example.withboard.domain.Post;
import com.example.withboard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostRepository postRepository;

    public Post save(String title, String content){
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setWrite_At(LocalDateTime.now());
        postRepository.save(post);
        return post;
    }
}
