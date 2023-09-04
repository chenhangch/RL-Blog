package com.robotlab.blog.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2023/7/19
 */
@Configuration
@ComponentScan("com.robotlab.blog.service")
@MapperScan(basePackages = {
    "com.robotlab.blog.service.user.repository.mapper",
})
public class ServiceAutoConfig {
}
