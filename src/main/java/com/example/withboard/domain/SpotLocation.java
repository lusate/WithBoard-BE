package com.example.withboard.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class SpotLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long location_id;

    @Column(nullable = false)
    private String parkName;

    @Column(precision = 10, scale = 2)
    private BigDecimal latitude;

    @Column(precision = 10, scale = 2)
    private BigDecimal longitude;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String hotspotAddress;
}
