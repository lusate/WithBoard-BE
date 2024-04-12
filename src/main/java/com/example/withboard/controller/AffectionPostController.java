package com.example.withboard.controller;


import com.example.withboard.common.dto.BaseResponse;
import com.example.withboard.dto.AffectionPostAllResponseDto;
import com.example.withboard.dto.AffectionPostCreateDto;
import com.example.withboard.facade.AffectionPostFacade;
import com.example.withboard.service.AffectionPostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/home")
@RequiredArgsConstructor
@Slf4j
public class AffectionPostController {

    private final AffectionPostService affectionPostService;

    private final AffectionPostFacade affectionPostFacade;

    @GetMapping("/affectionPost")
    public BaseResponse <List <AffectionPostAllResponseDto>> getAffectionPostAll(){

        List<AffectionPostAllResponseDto> allAffectionPost = affectionPostService.findAllAffectionPost();
        return BaseResponse.success(allAffectionPost);
    }


    @PostMapping("/affectionPost/create")
    public void createAffectionPost(@RequestBody AffectionPostCreateDto affectionPostCreateResponseDto){
        affectionPostFacade.create(affectionPostCreateResponseDto);
    }


}
