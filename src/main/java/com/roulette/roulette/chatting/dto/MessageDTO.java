package com.roulette.roulette.chatting.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
public class MessageDTO {
    private String content;
    private Long conversationId;
    private Long senderId; // sender의 타입을 Long으로 가정합니다.

    // 기본 생성자, 게터, 세터 생략
}
