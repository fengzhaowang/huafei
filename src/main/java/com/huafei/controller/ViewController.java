package com.huafei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/huafei")
public class ViewController {

    @GetMapping("main")
    public String goMain(Model model, HttpServletRequest request) {
        return "huafei/main";
    }

    @GetMapping("info")
    public String goInfo(Model model) {
        return "huafei/info";
    }

    @GetMapping("search")
    public String goSearch(Model model) {
        return "huafei/info";
    }

}
