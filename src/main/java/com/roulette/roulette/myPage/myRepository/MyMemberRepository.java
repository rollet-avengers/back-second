package com.roulette.roulette.myPage.myRepository;

import com.roulette.roulette.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyMemberRepository extends JpaRepository<Member, Long> {
}

