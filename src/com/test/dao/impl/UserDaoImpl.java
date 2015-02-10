package com.test.dao.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yantingjun on 2015/2/6.
 */
@Service
public class UserDaoImpl implements UserDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public User findUserByName(String name) {
        List list = hibernateTemplate.find("select u from User u where u.name=?",name);
        if(list != null && list.size()>0){
            return (User)list.get(0);
        }
        return null;
    }
}
