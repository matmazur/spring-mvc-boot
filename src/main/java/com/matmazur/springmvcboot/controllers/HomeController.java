package com.matmazur.springmvcboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @PostMapping(value = "/")
    public String home(
            ModelMap modelMap,
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b
    ) {
        if (a != null && b != null) {
            modelMap.put("result-adding", a + b);
            modelMap.put("result-substraction", a - b);
            modelMap.put("result-multiplying", a * b);
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            modelMap.put("result-dividing", numberFormat.format(a / b));
        }
        return "home";
    }
}
