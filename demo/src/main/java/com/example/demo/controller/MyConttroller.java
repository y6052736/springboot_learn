package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 000489 on 2018/1/11.
 */
@Controller
@RequestMapping("/demo")
public class MyConttroller {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello world11111222244444444444444444";
    }

}
