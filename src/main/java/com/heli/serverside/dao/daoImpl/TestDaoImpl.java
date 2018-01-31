package com.heli.serverside.dao.daoImpl;

import com.heli.serverside.bean.TestUsers;
import com.heli.serverside.dao.BaseDao;
import com.heli.serverside.dao.TestDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Mr.HL on 2018/1/25.
 */
@Repository
public class TestDaoImpl extends BaseDao implements TestDao<TestUsers> {
    //Test
    public TestUsers select() {
        SqlSession session = getSession();

        TestUsers users = users = session.selectOne("com.heli.serverside.Mapper.TestUsers.selectUserById", 1);
        session.close();
        return users;
    }

    public TestUsers select(String[] strings, Object... objs) {
        return null;
    }
}
