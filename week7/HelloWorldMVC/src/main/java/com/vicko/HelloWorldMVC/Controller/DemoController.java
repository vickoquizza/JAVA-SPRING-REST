package com.vicko.HelloWorldMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @GetMapping("/greetings")
    public String greetting(@RequestParam(name= "name", required = false, defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        return "greetings";
    }
}
