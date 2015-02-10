package com.test.dao;

import com.test.domain.User;

/**
 * Created by yantingjun on 2015/2/6.
 */
public interface UserDao {
    public User findUserByName(String name);
}
