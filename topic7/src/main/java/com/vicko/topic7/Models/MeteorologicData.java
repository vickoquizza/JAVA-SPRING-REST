package com.vicko.topic7.Models;

import com.vicko.topic7.Models.Location;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MeteorologicData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private  Location location;

    private double temperature;

    public MeteorologicData(String date, Location location, double temperature) {
        this.date = date;
        this.location = location;
        this.temperature = temperature;
    }
}
