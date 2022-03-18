package com.vicko.topic7.DTO;

import com.vicko.topic7.Models.Location;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MDDTO {
    private Long id;
    private String date;
    private Location location;
    private double[] temperature = new double[4];
}
