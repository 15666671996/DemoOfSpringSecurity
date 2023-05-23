package com.wangdefa.permission_controll.framework.security;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {

    @Test
    public void TestBCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(bCryptPasswordEncoder.encode("1234"));
        System.out.println(bCryptPasswordEncoder.matches("1234", "$2a$10$oK4/w0VpNoRTAWEeh2PjmOPC7.Gl4idGGgs4DV3oT4OE2Q1EVkC/u"));
    }
}
