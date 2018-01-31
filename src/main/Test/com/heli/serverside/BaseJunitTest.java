package com.heli.serverside;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/springmvc-servlet.xml","classpath*:spring/spring-mybatis.xml"})
public class BaseJunitTest {
    protected Logger logger = Logger.getLogger(getClass());

}
