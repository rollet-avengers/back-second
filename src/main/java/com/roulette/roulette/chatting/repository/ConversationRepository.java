package com.roulette.roulette.chatting.repository;

import com.roulette.roulette.entity.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
    List<Conversation> findByMembers_MemberId(Long memberId);
}
