package com.roulette.roulette.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ReplyImage {

    @Id
    @Column(name = "reply_img_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyImgId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reply_id", nullable = false)
    private Reply reply;
}
