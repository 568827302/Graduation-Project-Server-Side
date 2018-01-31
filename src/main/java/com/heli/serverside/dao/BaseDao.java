package com.heli.serverside.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Mr.HL on 2018/1/31.
 */
@Repository
public class BaseDao {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    protected SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }


}
