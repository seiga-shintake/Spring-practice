package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/session-scope")
public class SessionScopeController {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "session-scope-form";
    }

    @RequestMapping("/to-page1")
    public String toPage1(String hogehoge) {
        session.setAttribute("fugafuga", hogehoge);

        return "result-session-scope1";
    }

    @RequestMapping("/to-page2")
    public String toPage2() {
        return "result-session-scope2";
    }

    @RequestMapping("/to-page3")
    public String toPage3() {
        return "result-session-scope3";
    }

    
}
