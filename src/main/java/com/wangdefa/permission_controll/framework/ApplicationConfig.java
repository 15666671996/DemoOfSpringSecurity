package com.wangdefa.permission_controll.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wangdefa.permission_controll.mapper")
@MapperScan("com.wangdefa.permission_controll.framework.security")
public class ApplicationConfig {
}
