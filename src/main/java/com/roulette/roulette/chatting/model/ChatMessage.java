package com.roulette.roulette.chatting.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String chatId;
    private String author;
    private String content;

    // 생성자, getter, setter 생략...
    public ChatMessage(String id,String author,String content){
        this.chatId = id;
        this.author = author;
        this.content = content;
    }
}