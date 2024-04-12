package com.example.withboard.repository;

import com.example.withboard.domain.AffectionPost;
import com.example.withboard.domain.TogetherPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TogetherRepository extends JpaRepository<TogetherPost, Long> {
    List<TogetherPost> findAll();

}
