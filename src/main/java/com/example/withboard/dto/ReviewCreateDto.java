package com.example.withboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class ReviewCreateDto {
    private Long userId;
    private String content;
}
