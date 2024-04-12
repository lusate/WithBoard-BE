package com.example.withboard.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AffectionPostAllResponseDto {

    private Long affectionPostId;
    private Long userName;
    private String title;
    private String content;
    private Long likeNum;
    private String imageUrl;
    private LocalDateTime writeAt;

}
