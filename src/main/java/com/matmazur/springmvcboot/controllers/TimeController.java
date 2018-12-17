package com.matmazur.springmvcboot.controllers;

import com.matmazur.springmvcboot.components.TimeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {

    private final TimeComponent timeComponent;

    @Autowired
    public TimeController(TimeComponent timeComponent) {
        this.timeComponent = timeComponent;
    }

    @RequestMapping("/time")
    public String time(ModelMap modelMap) {

        modelMap.put("time", timeComponent);

        return "time";
    }
}
