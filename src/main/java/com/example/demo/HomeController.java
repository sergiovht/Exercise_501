package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/about")
    public String aboutPage(){
        return "/aboutpage";
    }

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/contactus")
    public String contactUs(){
        return "/contactus";
    }
}
