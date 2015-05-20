package com.test.dao;


import com.test.util.GenericsUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yantingjun on 2015/5/20.
 */
public class BaseDao<ID,T> implements GenericDao<ID,T>{

    private Class entityClass = null;
    public Class getEntityClass(){
        if(entityClass == null){
            entityClass = GenericsUtils.getSuperClassGenricType(this.getClass());
        }
        return entityClass;
    }
    @Override
    public List<T> findTbyHql(String hql) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public void fulsh() {

    }

    @Override
    public long getCount(String wherejpql, Object[] queryParams) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void save(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(Serializable... entityids) {

    }

    @Override
    public T find(Serializable entityId) {
        return null;
    }

    @Override
    public T get(Serializable entityId) {
        return null;
    }
}
