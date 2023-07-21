package com.github.pai.web.admin.rest;

import com.github.pai.api.model.vo.ResVo;
import com.github.pai.api.model.vo.user.dto.BaseUserInfoDTO;
import com.github.pai.service.user.service.UserService;
import com.github.pai.service.user.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
/**
 * 2023/7/19
 */
@RestController
@RequestMapping(path = {"/api/admin", "/admin"})
@Api(value = "后台登录登出管理控制器", tags = "后台登录")
public class AdminLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = {"/login"})
    public ResVo<BaseUserInfoDTO> login(@RequestParam(name = "username") String userName,
                                        @RequestParam(name = "password") String password) {

        return null;
    }

}
