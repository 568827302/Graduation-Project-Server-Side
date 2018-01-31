package com.heli.serverside;

import com.heli.serverside.bean.TestUsers;
import com.heli.serverside.dao.daoImpl.TestDaoImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Mr.HL on 2018/1/31.
 */
public class MybatisTest extends BaseJunitTest {
    @Autowired
    TestDaoImpl testDaoImpl;

    @Test
    public void test0() {
        TestUsers user = testDaoImpl.select();

        assertEquals("heli", user.getUsername());

        assertTrue(true);
    }
}
