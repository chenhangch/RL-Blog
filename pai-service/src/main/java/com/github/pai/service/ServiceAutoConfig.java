package com.github.pai.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2023/7/19
 */
@Configuration
@ComponentScan("com.github.pai.service")
@MapperScan(basePackages = {
    "com.github.pai.service.user.repository.mapper",
})
public class ServiceAutoConfig {
}
