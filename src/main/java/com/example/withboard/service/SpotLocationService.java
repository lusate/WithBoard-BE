package com.example.withboard.service;

import com.example.withboard.domain.SpotLocation;
import com.example.withboard.dto.HotSpotLocationResponseDto;
import com.example.withboard.dto.SpotLocationResponseDto;
import com.example.withboard.repository.SpotLocationRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
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

    public List<HotSpotLocationResponseDto> findAllSpotLocationDesc(){
        List<SpotLocation> spotLocations = spotLocationRepository.findAll();
        List<HotSpotLocationResponseDto> sortedSpotLocations = spotLocations.stream()
                            .map(HotSpotLocationResponseDto::of)
                            .toList();

        Comparator<HotSpotLocationResponseDto> comparing = Comparator.comparing(HotSpotLocationResponseDto::getPostCount, Comparator.reverseOrder());
        return sortedSpotLocations.stream().sorted(comparing).toList();
    }
}
