package com.roulette.roulette.post.repository;

import com.roulette.roulette.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    Page<Post> findAll(Pageable pageable);

    @Modifying
    @Query("UPDATE Post p SET p.choice = TRUE WHERE p.postId = :postId")
    int setPostChoiceTrue(Long postId);
}
