package com.wangdefa.permission_controll.framework.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/adminLogin")
    public String adminLogin() {

        return "!";
    }

    @RequestMapping("/login")
    public String login() {

        return "log?";
    }
}
