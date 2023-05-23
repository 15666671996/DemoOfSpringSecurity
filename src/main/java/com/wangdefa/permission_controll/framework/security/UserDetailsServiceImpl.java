package com.wangdefa.permission_controll.framework.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // select user info
        Admin admin = adminMapper.selectUserByUserName(username);
        if (admin == null) {
            throw new UsernameNotFoundException("incorrect username or password");
        }

        // select user permission


        // encapsulate UserDetails object and return

        return new LoggedAdmin(admin);
    }
}
