package com.vicko.topic7.Controller;

import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Models.MeteorologicData;
import com.vicko.topic7.Services.LocationService;
import com.vicko.topic7.Services.MeteorologicDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/meteorologicData")
public class MDController {

    @Autowired
    private MeteorologicDataServiceImpl service;

    @Autowired
    private LocationService locationService;

    @GetMapping({"/", "", "/home"})
    public String home(){
        return "homePage";
    }

    @GetMapping("/register")
    public String register(Model model){
        List<Location> locationList = locationService.getLocations();
        model.addAttribute("meteorologicData", new MeteorologicData());
        model.addAttribute("locationList",locationList);
        return "registerMDPage";
    }

    @PostMapping(path = "/add")
    private String add(MeteorologicData meteorologicData){
        service.createMD(meteorologicData);
        return "redirect:/meteorologicData/getMD";
    }

    @GetMapping("/getMD")
    public String getMD(Model model){
        List<MeteorologicData> MDList = service.getData();
        model.addAttribute("MDList", MDList);
        return "getMD";
    }

    @GetMapping("/edit/{id}")
    public String updateRecord(@PathVariable Long id, Model model){
        List<Location> locationList = locationService.getLocations();
        MeteorologicData meteorologicData = service.getMeteorologicalDataById(id);
        model.addAttribute("meteorologicData", meteorologicData);
        model.addAttribute("locationList",locationList);
        return "updateMDPage";
    }

    @PostMapping("/update")
    public String update(MeteorologicData meteorologicData){
        service.updateMD(meteorologicData);
        return "redirect:/meteorologicData/getMD";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        service.deleteMD(id);
        List<MeteorologicData> MDList = service.getData();
        model.addAttribute("MDList", MDList);
        return "redirect:/meteorologicData/getMD";
    }

}
