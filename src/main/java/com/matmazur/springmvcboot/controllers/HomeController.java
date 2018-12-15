package com.matmazur.springmvcboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(HttpServletRequest req) {

        String username = req.getParameter("username");

        if (username == null) {
            System.out.println("no username");
        } else {
            System.out.println(username);
            req.setAttribute("name", username);
        }
        return "home";
    }
}
