package com.example.withboard.controller;

import com.example.withboard.dto.HotSpotLocationResponseDto;
import com.example.withboard.dto.SpotLocationResponseDto;
import com.example.withboard.service.SpotLocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/home")
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    private final SpotLocationService spotLocationService;

    @GetMapping("/")
    public List<SpotLocationResponseDto> getAllSpotLocations(){
        return spotLocationService.findAllSpotLocation();
    }


    @GetMapping("/hotspot")
    public List<HotSpotLocationResponseDto> getHoySpotLocations(){
        return spotLocationService.findAllSpotLocationDesc();
    }

}
