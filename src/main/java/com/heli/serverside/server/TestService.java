package com.heli.serverside.server;

import com.heli.serverside.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Mr.HL on 2018/1/25.
 */
@Service("testService")
public class TestService {
    @Resource
    TestDao testDaoImpl;


    public boolean checkUser(String username, String password) {
        return testDaoImpl.select(new String[]{"username", "password"}, username, password) == null ? false : true;
    }
}
