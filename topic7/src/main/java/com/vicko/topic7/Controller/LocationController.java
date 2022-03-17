package com.vicko.topic7.Controller;

import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Services.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.random.RandomGenerator;

@RequestMapping("/locations")
@Controller
@AllArgsConstructor
public class LocationController {

    private final LocationService service;

    @GetMapping
    public String ShowLocationForm(Model model){
        model.addAttribute("location", new Location());
        return "locationForm";
    }

    @PostMapping(path = "/add")
    private String add(Location location){
        service.saveLocation(location);
        return "redirect:/locations";
    }
}
