package com.github.pai.web;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 2023/7/18
 */

@SpringBootApplication
@EnableKnife4j
public class QuickPaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickPaiApplication.class, args);
    }
}
