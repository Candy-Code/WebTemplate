package com.test.service;

import com.test.pojo.StatusCode;
import com.test.pojo.response.login.LoginResponse;

/**
 * Created by yantingjun on 2015/2/6.
 */
public interface LoginService {

    public LoginResponse login(String name,String pwd);
}
