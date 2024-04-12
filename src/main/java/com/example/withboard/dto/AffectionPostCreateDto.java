package com.example.withboard.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AffectionPostCreateDto {
    private  String title;
    private Long userId;
    private  String imageUrl;
    private String content;

}
