package com.example.withboard.repository;

import com.example.withboard.domain.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LikesRepository extends JpaRepository<Likes,Long> {


//   공부하기  @Query(value = "select count(like_tb.like_id) as likeNum from (select * from likes where likes.post_id=:AffectionPostId) as like_tb where like_tb.like_status=1",nativeQuery = true)
//    Long getLikeNum(@Param("AffectionPostId")Long AffectionPostId);

}
