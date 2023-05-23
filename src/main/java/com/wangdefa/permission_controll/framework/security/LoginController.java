package com.wangdefa.permission_controll.framework.security;

import com.wangdefa.permission_controll.framework.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

//    @PostMapping("/admin/login")
    @PostMapping("/login")
    public AjaxResult adminLogin(@RequestBody Admin admin) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(admin.getUserName(), admin.getPassword());

        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        if(authentication==null){
            throw new RuntimeException("Login Failed");
        }

        System.out.println();


        return null;
    }

//    @PostMapping("/login")
//    public AjaxResult login() {
//
//        return null;
//    }
}
