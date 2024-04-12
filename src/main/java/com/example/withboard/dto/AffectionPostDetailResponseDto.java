package com.example.withboard.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AffectionPostDetailResponseDto {

    private Long affectionId;
    private String title;
    private String content;
    private Long userId;
    private String urlImage;

}
