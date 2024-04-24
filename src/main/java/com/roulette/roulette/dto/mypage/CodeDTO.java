package com.roulette.roulette.dto.mypage;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class CodeDTO {
    private String codeUrl;
    private LocalDateTime createTime;
    private String codeId;
    private String codeName;

    public CodeDTO (String codeUrl, LocalDateTime createTime, String codeId, String codeName){
        this.codeUrl = codeUrl;
        this.createTime = createTime;
        this.codeId = codeId;
        this.codeName = codeName;
    }
}
