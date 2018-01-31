package com.heli.serverside.controller;

import com.heli.serverside.server.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping("hello")
    public String hello(String param1, String param2, Model model) {
//        WebApplicationContextUtils.getWebApplicationContext()
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);

        return "success";
    }
    @ResponseBody
    @RequestMapping(value = "testJson", method = RequestMethod.POST)
    public String testJson(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
        return "{username:'" + username + "', password:'" + password + "', validateNum: 123}";
    }

    @RequestMapping(value="checkUser", method = RequestMethod.GET)
    public String checkUser(String username, String password, Model model) {
        if(testService.checkUser(username, password)) {

            return "";
        } else {

            return "";
        }
    }
}
