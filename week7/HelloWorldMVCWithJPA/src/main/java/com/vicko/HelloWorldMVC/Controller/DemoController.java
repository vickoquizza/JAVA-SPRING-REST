package com.vicko.HelloWorldMVC.Controller;

import com.vicko.HelloWorldMVC.Models.Persona;
import com.vicko.HelloWorldMVC.Repositories.PersonaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    private final PersonaRepository repository;

    public DemoController(PersonaRepository repository){
        this.repository = repository;
    }

    @GetMapping("/greetings")
    public String greetting(@RequestParam(name= "name", required = false, defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        Persona p = new Persona("Mario Mario");
        repository.save(p);
        return "greetings";
    }

    @GetMapping("/lista")
    public String getPerson(Model model){
        model.addAttribute("personas", repository.findAll());
        return "greetings";
    }
}
