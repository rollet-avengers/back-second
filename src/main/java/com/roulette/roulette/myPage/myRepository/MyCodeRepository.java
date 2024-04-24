package com.roulette.roulette.myPage.myRepository;

import com.roulette.roulette.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MyCodeRepository extends JpaRepository<Code, String> {
    @Query("SELECT p FROM Code p WHERE p.member.memberId = :memberId")
    List<Code> findAllByMemberId(Long memberId);

}
