package com.vicko.RecipeProject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex(){
        System.out.println("Something to say....1234");
        return "index";
    }
}
