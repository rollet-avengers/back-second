package com.roulette.roulette.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "code")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Code {
    @Id
    @Column(name = "code_id")
    private String codeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "code_url")
    private String codeUrl;

    @Column(name = "confirm")
    private String confirm;

    @CreatedDate
    @Column(name = "create_time")
    private LocalDateTime createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private LocalDateTime  updateTime;

    @Column(name = "delete_time")
    private LocalDateTime  deleteTime;

    @Column(name = "code_name")
    private String codeName;

}
