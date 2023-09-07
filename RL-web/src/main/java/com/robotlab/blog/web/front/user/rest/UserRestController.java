package com.robotlab.blog.web.front.user.rest;

import com.robotlab.blog.api.model.vo.ResVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @GetMapping("/health")
    @ApiOperation(value = "user api:: health", notes = "user api 健康测试")
    public ResVo<String> health() {
        return ResVo.ok("user api :: health");
    }

}
