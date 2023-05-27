package com.jimbo.springboot.app.springbootdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController{

    
    public String index(Model model){
        return "index";
    }

}

