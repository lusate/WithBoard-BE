package com.example.withboard.facade;

import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.Post;
import com.example.withboard.dto.AffectionPostCreateDto;
import com.example.withboard.service.AffectionPostService;
import com.example.withboard.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AffectionPostFacade {

    private final AffectionPostService affectionPostService;
    private final PostService postService;


    @Transactional
    public void create(AffectionPostCreateDto affectionPostCreateDto) {
        Post createdPost = postService.save(affectionPostCreateDto.getTitle(), affectionPostCreateDto.getContent());
        AffectionPost affectionPost = affectionPostService.save(createdPost, affectionPostCreateDto.getUserId());

    }

}
