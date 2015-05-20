package com.test.dao;

/**
 * Created by yantingjun on 2015/5/20.
 */
import com.test.util.GenericsUtils;

import java.io.Serializable;
import java.util.List;


/**
 * 通用Dao父类实现的接?口，只提供常见的一些功能，其它特殊的功能，可以在子接口中定义。
 * 事务也在需要的时候加到实现类中
 *
 * @param <T> 实体类型
 */
public interface GenericDao<ID,T> {


    public List<T> findTbyHql(String hql);
    /**
     * by this method you can get all information about T
     * @return
     */
    public List<T> findAll();

    /**
     * 和数据库同步
     * @param entityClass 实体类
     * @return
     */
    public void fulsh();
    /**
     * 获取记录总数
     * @param entityClass 实体类
     * @return
     */
    public long getCount(final String wherejpql,
                         final Object[] queryParams);
    /**
     * 清除一级缓存的数据
     */
    public void clear();
    /**
     * 保存实体
     * @param entity 实体id
     */
    public void save(Object entity);
    /**
     * 更新实体
     * @param entity 实体id
     */
    public void update(Object entity);
    /**
     * 删除实体
     * @param entityClass 实体类
     * @param entityids 实体id数组
     */
    public void delete(Serializable ... entityids);
    /**
     * 获取实体
     * @param <T>
     * @param entityClass 实体类
     * @param entityId 实体id
     * @return
     */
    public T find(Serializable entityId)  ;
    /**
     * 获取实体
     * @param <T>
     * @param entityClass 实体类
     * @param entityId 实体id
     * @return
     */
    public T get(Serializable entityId);

}




