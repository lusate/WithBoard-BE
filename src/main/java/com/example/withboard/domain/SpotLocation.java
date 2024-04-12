package com.example.withboard.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SpotLocation {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Getter
    @Column(nullable = false)
    private String parkName;

    @Getter
    @Column(precision = 10, scale = 2)
    private BigDecimal latitude;

    @Getter
    @Column(precision = 10, scale = 2)
    private BigDecimal longitude;

    @Getter
    @Column(nullable = false)
    private String imageUrl;

    @Getter
    @Column(nullable = false)
    private String hotspotAddress;

    @OneToMany(mappedBy = "spotLocation", cascade = CascadeType.ALL)
    private List<TogetherPost> spotLocationList = new ArrayList<>();

    @OneToMany(mappedBy = "spotLocation", cascade = CascadeType.ALL)
    private List<TogetherPost> togetherPostList = new ArrayList<>();
}
