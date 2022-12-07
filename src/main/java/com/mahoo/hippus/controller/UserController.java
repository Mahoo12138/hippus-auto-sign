package com.mahoo.hippus.controller;

import com.mahoo.hippus.common.ResultResponse;
import com.mahoo.hippus.common.annotation.FormatRestController;
import com.mahoo.hippus.common.annotation.NotFormatRequest;
import com.mahoo.hippus.common.annotation.OperLog;
import com.mahoo.hippus.dto.UserSigninDTO;
import com.mahoo.hippus.model.User;
import com.mahoo.hippus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FormatRestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public List<User> isFormat(){
        return this.userService.list();
    }

    @NotFormatRequest
    @GetMapping("/not")
    public List<User> notFormat(){
        return this.userService.list();
    }

    @GetMapping("/error")
    public List<User> testError() throws Exception {
        throw new Exception("fdsafds");
    }


    @OperLog(operModule = "认证模块",operType = "用户注册", operDescription = "用户名密码注册")
    @PostMapping("/signin")
    public String userSignin(@Validated @RequestBody UserSigninDTO dto) {
        return "ok";
    }
}
