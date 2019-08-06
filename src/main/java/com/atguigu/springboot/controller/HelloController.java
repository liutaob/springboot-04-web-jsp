package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String abc(Model model, HttpServletRequest request) {
        //获取上下文环境绝对路径
        request.getSession().getServletContext().getRealPath("/");
        model.addAttribute("hello", "你好111");
        return "success";
    }
}
