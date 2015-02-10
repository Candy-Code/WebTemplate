package com.test.controller;

import com.test.pojo.StatusCode;
import com.test.pojo.response.login.LoginResponse;
import com.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yantingjun on 2015/2/6.
 */
@Controller
@RequestMapping(produces = "application/json;charset=UTF-8")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public @ResponseBody LoginResponse login(
            @RequestParam(value="name",required = false) String name,
            @RequestParam(value = "password",required = false)String password)
    {


        return loginService.login(name,password);
    }
}
