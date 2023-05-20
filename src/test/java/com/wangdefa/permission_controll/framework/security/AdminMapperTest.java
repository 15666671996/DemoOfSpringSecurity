package com.wangdefa.permission_controll.framework.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AdminMapperTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void testSelect(){
        List<Admin> admins = adminMapper.selectUserList(null);
        System.out.println(admins);
    }

}
