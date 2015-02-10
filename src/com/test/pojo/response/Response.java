package com.test.pojo.response;

import java.io.Serializable;

/**
 * Created by yantingjun on 2015/2/6.
 */
public class Response implements Serializable{
    private int statusCode;
    private String msg;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
