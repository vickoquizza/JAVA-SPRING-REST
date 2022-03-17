package com.vicko.topic7.Services;

import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Models.MeteorologicData;

import java.util.List;

public interface IMeteorologicDataService {

    public void createMD(MeteorologicData data);
    public List<MeteorologicData> getData();
    public MeteorologicData getMeteorologicalDataById(Long id);
    public void updateMD(MeteorologicData data);
    public void deleteMD(Long id);


}
