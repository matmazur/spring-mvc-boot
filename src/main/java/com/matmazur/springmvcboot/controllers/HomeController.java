package com.matmazur.springmvcboot.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(
            @RequestParam(name = "username", defaultValue = "Noname", required = false) String username,
            @RequestHeader(name = "User-Agent") String agent,
            @RequestHeader HttpHeaders httpHeaders,
            ModelMap modelMap) {

        modelMap.put("name", username);

        System.out.println(">>>>>>>>>>>>>>HEADERS>>>>>>>>>>>>");
        for (String s : httpHeaders.toSingleValueMap().keySet()) {
            System.out.println(s + "  -  " + httpHeaders.get(s));
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(agent);
        System.out.println(username);
        return "home";
    }
}
