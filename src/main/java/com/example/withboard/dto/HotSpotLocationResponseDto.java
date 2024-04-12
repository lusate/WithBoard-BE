package com.example.withboard.dto;

import com.example.withboard.domain.SpotLocation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class HotSpotLocationResponseDto {

    private Long Id;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String parkName;

    private String imageUrl;

    private String spotAddress;

    private Long postCount;

    public static HotSpotLocationResponseDto of(SpotLocation spotLocation){
        long count = Optional.ofNullable(spotLocation.getTogetherPostList()).orElse(Collections.emptyList()).size();
        return new HotSpotLocationResponseDto(
                spotLocation.getLocationId(),
                spotLocation.getLatitude(),
                spotLocation.getLongitude(),
                spotLocation.getParkName(),
                spotLocation.getImageUrl(),
                spotLocation.getHotspotAddress(),
                count
        );

    }
}
