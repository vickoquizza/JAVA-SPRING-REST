package com.vicko.SpringBootJokesApp.Controllers;

import com.vicko.SpringBootJokesApp.Repositories.JokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private  final JokeRepo jokeRepo;

    public JokeController(JokeRepo jokeRepo) {
        this.jokeRepo = jokeRepo;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeRepo.getRandomJoke());

        return "index";
    }

}
