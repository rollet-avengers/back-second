package com.roulette.roulette.post.repository;

import com.roulette.roulette.entity.Image;
import com.roulette.roulette.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findByPostImg_Post(Post post);
}
