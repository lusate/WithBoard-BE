package com.example.withboard.dto;


import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.Image;
import com.example.withboard.domain.Likes;
import com.example.withboard.domain.Post;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AffectionPostAllResponseDto {

    private Long affectionPostId;
    private String userName;
    private String title;
    private String content;
    private LocalDateTime writeAt;
    private Long likeNum;
    private String imageUrl;


    public static AffectionPostAllResponseDto of(AffectionPost affectionPost){
        Post post = affectionPost.getPost();
        List<Likes> likesList = post.getLikeList();
        long count= 0;
        for (Likes likes : likesList) {
            if (likes.isLikeStatus() == true) {
               count++;
            }
        }

        String firstImage=null;
        List<Image> imageList = post.getImageList();
        if (!imageList.isEmpty()) {
            firstImage = imageList.get(0).getImageUrl();
        }


        return new AffectionPostAllResponseDto(
                affectionPost.getAffectionPostId(),
                affectionPost.getUser().getUsername(),
                post.getTitle(),
                post.getContent(),
                post.getWrite_At(),
                count,
                firstImage
        );
    }
}
