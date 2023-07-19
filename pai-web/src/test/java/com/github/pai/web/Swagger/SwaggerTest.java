package com.github.pai.web.Swagger;

import com.github.pai.web.QuickPaiApplication;
import io.swagger.annotations.ApiOperation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 2023/7/18
 */
@SpringBootTest(classes = QuickPaiApplication.class)
public class SwaggerTest {
    @ApiOperation("测试knife4j")
    @RequestMapping(value = "/testKnife4j", method = RequestMethod.POST)
    @Test
    public String testKnife4j() {
        return "  ====>  Knife4j";
    }
}
