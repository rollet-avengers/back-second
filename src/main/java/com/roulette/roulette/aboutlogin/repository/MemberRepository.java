package com.roulette.roulette.aboutlogin.repository;

import com.roulette.roulette.entity.Member;
import com.roulette.roulette.aboutlogin.domaindto.MemberDto;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public Long membersave(MemberDto m){
        Member member=new Member(m.getName(),m.getEmail());
        member.setCreate_time(LocalDateTime.now());
        em.persist(member);
        return member.getMemberId();
    }

    public Optional<Member> findmemberbymail(String email){
        String query="select m from Member m where m.email=:email";
        List<Member> member=em.createQuery(query,Member.class)
                .setParameter("email",email)
                .getResultList();
        if (member.size()==0){
            return Optional.ofNullable(null);
        }
        return Optional.ofNullable(member.get(0));
    }

    private void deletemember(Long memberid){
        Member member=em.find(Member.class,memberid);
        member.setDeleted_time(LocalDateTime.now());
    }
}
