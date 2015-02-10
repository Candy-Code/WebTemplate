package com.test.pojo;

/**
 * Created by yantingjun on 2015/2/6.
 */
public enum StatusCode {
    SUCCESS(0,"SUCCESS"),
    NOT_LOGIN(1,"NOT LOGIN"),
    LOGIN_FAILED(2,"LOGIN_FAILED");

    private int code;
    private String msg;

    StatusCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
