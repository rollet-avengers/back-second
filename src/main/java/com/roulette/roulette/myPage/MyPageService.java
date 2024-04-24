package com.roulette.roulette.myPage;


import com.roulette.roulette.dto.mypage.*;
import com.roulette.roulette.entity.Code;
import com.roulette.roulette.entity.Member;
import com.roulette.roulette.entity.Post;
import com.roulette.roulette.dto.mypage.*;
import com.roulette.roulette.myPage.myRepository.MyCodeRepository;
import com.roulette.roulette.myPage.myRepository.MyMemberRepository;
import com.roulette.roulette.myPage.myRepository.MyPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private  final MyMemberRepository myMemberRepository;
    private  final MyPostRepository myPostRepository;
    private  final MyCodeRepository myCodeRepository;


    //내정보 조회하기
    public MemberDTO getMemberDTO(Long member_id){
        Member member =  myMemberRepository.findById(member_id).orElse(null);
        if (member == null)
            return null;
        return new MemberDTO(member.getName(), member.getEmail());
    }

<<<<<<< Updated upstream
    //내가한 질문들 받아오기
    public MyPageDTO getMyPageData(Long member_id) {
        MyPageDTO myPageDTO = new MyPageDTO();

        // 해당 memberId로 회원의 이메일을 가져와 설정
        Member member = myMemberRepository.findById(member_id).orElse(null);
        if (member != null) {
            myPageDTO.setEmail(member.getEmail());
        } else {
            myPageDTO.setEmail("No email");
        }

        // 해당 memberId로 회원이 작성한 모든 질문을 가져와 설정
        List<Post> postList = myPostRepository.findAllByMemberId(member_id);
        List<PostDTO> postDTOList = new ArrayList<>();
        for (Post post : postList) {
            PostDTO postDTO = new PostDTO();

            postDTO.setPostId(post.getPostId());
            postDTO.setTitle(post.getTitle());
            postDTO.setCreatedTime(post.getCreateTime());
            postDTO.setImgSrc("127.0.0.1/img/img" + post.getPostId());

            postDTOList.add(postDTO);
        }
        myPageDTO.setPostList(postDTOList);

        return myPageDTO;
    }


    //내가 올린 코드 불러오기
    public MyCodeDTO getMyCodeData(Long member_id){
        MyCodeDTO myCodeDTO = new MyCodeDTO();

//        // 해당 memberId로 회원의 코드 URL과 생성 시간을 가져와 설정
        List<Code> codeList = myCodeRepository.findAllByMemberId(member_id);

        // 해당 memberId로 회원이 작성한 모든 code를 가져와 설정
        List<CodeDTO> codeDTOList = new ArrayList<>();
        for (Code code : codeList) {
            CodeDTO codeDTO = new CodeDTO();
            codeDTO.setCodeId(code.getCodeId());
            codeDTO.setCodeName(code.getCodeName());
            codeDTO.setCodeUrl(code.getCodeUrl());
            codeDTO.setCreateTime(code.getCreateTime());
            codeDTOList.add(codeDTO);
        }
        myCodeDTO.setCodeList(codeDTOList);

        return myCodeDTO;
    }

    public Object goMyPage(Long member_id) {
        return null;
    }
=======
    public void insert(SaveCodeDTO saveCodeDTO);

>>>>>>> Stashed changes
}
