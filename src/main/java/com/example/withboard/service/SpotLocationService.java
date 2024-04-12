package com.example.withboard.service;

import com.example.withboard.domain.SpotLocation;
import com.example.withboard.dto.SpotLocationResponseDto;
import com.example.withboard.repository.SpotLocationRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SpotLocationService {
    private final SpotLocationRepository spotLocationRepository;

    public List<SpotLocationResponseDto> findAllSpotLocation(){
        List<SpotLocation> spotLocations = spotLocationRepository.findAll();
        return spotLocations.stream().map(SpotLocationResponseDto::of).toList();
    }

}
