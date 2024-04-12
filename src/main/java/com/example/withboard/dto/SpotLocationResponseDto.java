package com.example.withboard.dto;

import com.example.withboard.domain.SpotLocation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class SpotLocationResponseDto {
    private Long Id;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String parkName;

    private String imageUrl;

    private String spotAddress;


    public  static SpotLocationResponseDto of(SpotLocation spotLocation){
        return new SpotLocationResponseDto(
                spotLocation.getLocationId(),
                spotLocation.getLatitude(),
                spotLocation.getLongitude(),
                spotLocation.getParkName(),
                spotLocation.getImageUrl(),
                spotLocation.getHotspotAddress()
        );

    }

}
