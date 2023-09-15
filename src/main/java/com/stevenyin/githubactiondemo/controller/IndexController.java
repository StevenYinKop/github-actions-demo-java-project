package com.stevenyin.githubactiondemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    @Value("${spring.profiles.active}")
    public String activeProfile;
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("env", activeProfile);
        return mv;
    }

    @RequestMapping("/api")
    @ResponseBody
    public Map<String, String> print() {
        return Map.of("env", activeProfile, "data1", "value1", "data2", "value2");
    }
}
