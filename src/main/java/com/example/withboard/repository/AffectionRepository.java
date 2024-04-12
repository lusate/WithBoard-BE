package com.example.withboard.repository;

import com.example.withboard.domain.AffectionPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AffectionRepository extends JpaRepository<AffectionPost,Long> {


    List<AffectionPost> findAll();
}
