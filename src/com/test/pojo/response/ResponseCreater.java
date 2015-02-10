package com.test.pojo.response;

import com.test.pojo.StatusCode;

/**
 * Created by yantingjun on 2015/2/6.
 */
public class ResponseCreater {

    public static Response create(StatusCode statusCode){
        Response response = new Response();
        response.setStatusCode(statusCode.getCode());
        response.setMsg(statusCode.getMsg());
        return response;
    }
}
