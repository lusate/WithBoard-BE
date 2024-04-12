package com.example.withboard.dto;

import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.Image;
import com.example.withboard.domain.Likes;
import com.example.withboard.domain.Post;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AffectionPostDetailResponseDto {

    private Long affectionId;
    private String title;
    private String content;
    private List<String> urlImage;
    private String username;

    public static AffectionPostDetailResponseDto of(AffectionPost affectionPost){
        Post post = affectionPost.getPost();

        return new AffectionPostDetailResponseDto(
                affectionPost.getAffectionPostId(),
                post.getTitle(),
                post.getContent(),
                post.getPostImages(),
                affectionPost.getUser().getUsername()
        );

    }
}

