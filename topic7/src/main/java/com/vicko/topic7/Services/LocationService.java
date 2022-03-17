package com.vicko.topic7.Services;

import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Repositories.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@Service
@AllArgsConstructor
public class LocationService {

    private final LocationRepository repository;

    public void saveLocation(Location location){
        DecimalFormat df = new DecimalFormat("#.#####");
        location.setLat(Double.parseDouble(df.format(location.getLat())));
        location.setLon(Double.parseDouble(df.format(location.getLon())));
        repository.save(location);
    }

    public List<Location> getLocations(){
        return repository.findAll();
    }
}
