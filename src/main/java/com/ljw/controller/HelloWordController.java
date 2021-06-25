package com.ljw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* @Function helloword 的控制器
* @Author ljw
* @Time 2020年1月5日19:43:25
* @param
* @return
* */
@Controller
public class HelloWordController {

        @ResponseBody
        @RequestMapping("/hello")
        public String helloword(){
                return "LJW HelloWord! Welcome to Spring Boot~";
        }
}
