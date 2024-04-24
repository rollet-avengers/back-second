package com.roulette.roulette.reply.controller;

import com.roulette.roulette.aboutlogin.jwt.JwtUtill;
import com.roulette.roulette.aboutlogin.repository.MemberJpaRepository;
import com.roulette.roulette.code.request.CodeRequest;
import com.roulette.roulette.entity.Member;
import com.roulette.roulette.reply.service.ReplyService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/reply")
public class ReplyController {

    private final ReplyService replyService;
    private final MemberJpaRepository memberJpaRepository;
    private final JwtUtill jwtUtill;
    @PostMapping
    public ResponseEntity<String> uploadReply(
            @RequestBody CodeRequest codeRequest,
            HttpServletRequest servletRequest
    ){

        String token = servletRequest.getHeader("Authorization").substring(7);
        Member member = memberJpaRepository.findById(jwtUtill.getidfromtoken(token)).get();

        replyService.setReply(codeRequest.getPostId(), codeRequest.getHtml(),codeRequest.getCss(), codeRequest.getJs(), member);

        return ResponseEntity.ok("success");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map> downloadReplyCode(@PathVariable (value = "id") Long id) {

        String[] codeText= replyService.selectReplyById(id);

        Map<String,String> map = new HashMap<>();
        map.put("html",codeText[0]);
        map.put("css",codeText[1]);
        map.put("js",codeText[2]);

        return ResponseEntity.ok(map);

    }

}
