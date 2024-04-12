package com.example.withboard.repository;


import com.example.withboard.domain.SpotLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpotLocationRepository extends JpaRepository<SpotLocation, Long> {
    List<SpotLocation> findAll();


}
