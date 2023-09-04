package com.robotlab.blog.web.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2023/7/19
 */
@RestController
@RequestMapping("/common")
public class DictCommonController {

    @GetMapping("/list")
    public String list() {
        return "hello spring";
    }
}
