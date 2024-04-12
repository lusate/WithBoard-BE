package com.example.withboard.dto.requestDto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class LikesRequestDto {
    private Long userId;
    private Long postId;
}
