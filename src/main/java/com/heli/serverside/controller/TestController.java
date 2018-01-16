package com.heli.serverside.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("hello")
    public String hello(String param1, String param2, Model model) {
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
}
