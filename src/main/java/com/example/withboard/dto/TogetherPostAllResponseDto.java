package com.example.withboard.dto;

import com.example.withboard.domain.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TogetherPostAllResponseDto {
    private Long affectionPostId;
    private String userName;
    private String title;
    private String content;
    private LocalDateTime writeAt;
    private Long likeNum;
    private String imageUrl;


    public static TogetherPostAllResponseDto of(TogetherPost togetherPost){
        Post post = togetherPost.getPost();
        List<Likes> likesList = post.getLikeList();
        long count= 0;
        for (Likes likes : likesList) {
            if (likes.isLikeStatus()) {
                count++;
            }
        }

        String firstImage=null;
        List<Image> imageList = post.getImageList();
        if (!imageList.isEmpty()) {
            firstImage = imageList.get(0).getImageUrl();
        }


        return new TogetherPostAllResponseDto(
                togetherPost.getTogetherPostId(),
                togetherPost.getUser().getUsername(),
                post.getTitle(),
                post.getContent(),
                post.getWrite_At(),
                count,
                firstImage
        );
    }
}
