package com.roulette.roulette.chatting.repository;

import com.roulette.roulette.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByConversation_ConversationId(Long conversationId);
}
