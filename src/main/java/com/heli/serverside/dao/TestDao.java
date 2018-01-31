package com.heli.serverside.dao;

/**
 * Created by Mr.HL on 2018/1/25.
 */
public interface TestDao<T> {
//    public boolean login(String username, String password);

    T select(String[] strings, Object... objs);
//    public
}
