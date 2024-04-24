package com.roulette.roulette.aboutlogin.service;

import com.roulette.roulette.entity.Member;
import com.roulette.roulette.aboutlogin.domaindto.MemberDto;
import com.roulette.roulette.aboutlogin.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public Long membersave(MemberDto member){
        return memberRepository.membersave(member);
    }

    public Optional<Member> findmemberbyemail(String email){
        return memberRepository.findmemberbymail(email);
    }
}
