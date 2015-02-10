package com.test.util;

/**
 * Created by yantingjun on 2015/2/6.
 */
public class PasswordChecker {
    public static boolean work(String input_pwd,String db_pwd){
        return  input_pwd.equals(db_pwd);
    }
}
