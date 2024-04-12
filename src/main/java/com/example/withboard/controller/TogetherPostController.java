package com.example.withboard.controller;


import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.dto.TogetherPostAllResponseDto;
import com.example.withboard.service.TogetherPostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home")
public class TogetherPostController {

    private final TogetherPostService togetherPostService;
    @GetMapping("/togetherPost")
    public BaseResponse<List<TogetherPostAllResponseDto>> getTogetherPostAll(){

        List<TogetherPostAllResponseDto> togetherList = togetherPostService.findAllTogetherPost();
        return BaseResponse.success(togetherList);
    }
}
