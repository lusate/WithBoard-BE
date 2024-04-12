package com.example.withboard.controller;


import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.service.AffectionPostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/home")
@RequiredArgsConstructor
@Slf4j
public class AffectionPostController {

    private final AffectionPostService affectionPostService;


    @GetMapping("/affectionPost")
    public BaseResponse <List <AffectionPostAllResponseDto>> getAffectionPostAll(){

        List<AffectionPostAllResponseDto> allAffectionPost = affectionPostService.findAllAffectionPost();
        return BaseResponse.success(allAffectionPost);
    }



    @DeleteMapping("/affectionPost/{affectionPostId}")
    public BaseResponse<Void> deleteAffectionPost(@PathVariable Long affectionPostId){
        affectionPostService.deleteAffectionPost(affectionPostId);
        return BaseResponse.success();
    }

}
