package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.pojo.StatusCode;
import com.test.pojo.response.login.LoginResponse;
import com.test.service.LoginService;
import com.test.util.PasswordChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yantingjun on 2015/2/6.
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDao userDao;
    @Override
    public LoginResponse login(String name, String pwd) {
        LoginResponse response = new LoginResponse();
        System.out.println("login");
        User user = userDao.findUserByName(name);
        if(user == null){
            response.setStatusCode(StatusCode.LOGIN_FAILED.getCode());
            response.setMsg("该账号不存在！");
        }else if(PasswordChecker.work(pwd,user.getPwd())){
            response.setStatusCode(StatusCode.SUCCESS.getCode());
            response.setMsg(StatusCode.SUCCESS.getMsg());
        }else{
            response.setStatusCode(StatusCode.LOGIN_FAILED.getCode());
            response.setMsg("密码错误！");
        }
        return response;
    }
}
