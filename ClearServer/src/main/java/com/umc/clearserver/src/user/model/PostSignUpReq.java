package com.umc.clearserver.src.user.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor // 해당 클래스의 모든 멤버 변수(email, password, nickname, profileImage)를 받는 생성자를 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 해당 클래스의 파라미터가 없는 생성자를 생성, 접근제한자를 PROTECTED로 설정.
public class PostSignUpReq {
    private String email;
    private String nickname;
    private String password1;
    private String password2;
}