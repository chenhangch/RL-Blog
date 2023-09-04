package com.robotlab.blog.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(ProxyPro)
@ComponentScan(basePackages = "com.robotlab.blog.core")
public class CoreAutoConfig {
}
