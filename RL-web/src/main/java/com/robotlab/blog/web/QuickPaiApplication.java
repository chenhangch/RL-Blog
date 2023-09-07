package com.robotlab.blog.web;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.robotlab.blog.web.global.SystemExceptionHandler;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 2023/7/18
 */

@SpringBootApplication
@EnableKnife4j
public class QuickPaiApplication implements WebMvcConfigurer , ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(QuickPaiApplication.class, args);
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(0, new SystemExceptionHandler());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
