package com.roulette.roulette.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Entity
@Table(name = "member")
@Data
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;


    @Column(name="create_date")
    private LocalDateTime create_time;

    @Column(name="deleted_date")
    private LocalDateTime deleted_time;


    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Member() {
    }
}
