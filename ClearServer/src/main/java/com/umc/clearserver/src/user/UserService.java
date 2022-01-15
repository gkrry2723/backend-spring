package com.umc.clearserver.src.user;

import com.umc.clearserver.utils.JwtService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service란?
 * Controller에 의해 호출되어 실제 비즈니스 로직과 트랜잭션을 처리: Create, Update, Delete 의 로직 처리
 * 요청한 작업을 처리하는 관정을 하나의 작업으로 묶음
 * dao를 호출하여 DB CRUD를 처리 후 Controller로 반환
 */
@Service    // [Business Layer에서 Service를 명시하기 위해서 사용] 비즈니스 로직이나 respository layer 호출하는 함수에 사용된다.
            // [Business Layer]는 컨트롤러와 데이터 베이스를 연결
public class UserService {
    final Logger logger = LoggerFactory.getLogger(this.getClass()); // Log 처리부분: Log를 기록하기 위해 필요한 함수입니다.

    // *********************** 동작에 있어 필요한 요소들을 불러옵니다. *************************
    private final UserDao userDao;
    private final UserProvider userProvider;
    private final JwtService jwtService; // JWT부분은 7주차에 다루므로 모르셔도 됩니다!

    public UserService(UserDao userDao, UserProvider userProvider, JwtService jwtService) {
        this.userDao = userDao;
        this.userProvider = userProvider;
        this.jwtService = jwtService;
    }

    //++++++++++++++++++++++++++++++++++++++++++++++
    //전준휘의 영역!
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //전준휘의 영역 끝!
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //송해광님의 영역
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //송해광님의 영역 끝!
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //김현주님의 영역!
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //김현주님의 영역 끝!
    //++++++++++++++++++++++++++++++++++++++++++++++


    //++++++++++++++++++++++++++++++++++++++++++++++
    //김영진님의 영역!
    //++++++++++++++++++++++++++++++++++++++++++++++

    //++++++++++++++++++++++++++++++++++++++++++++++
    //김영진님의 영역 끝!
    //++++++++++++++++++++++++++++++++++++++++++++++
}
