package com.vicko.topic7.Services;

import com.vicko.topic7.DTO.MDDTO;
import com.vicko.topic7.Exceptions.MDNotFoundException;
import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Models.MeteorologicData;
import com.vicko.topic7.Repositories.LocationRepository;
import com.vicko.topic7.Repositories.MeteorologicDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class MeteorologicDataServiceImpl implements IMeteorologicDataService{

    private final MeteorologicDataRepository MDRepository;
    private final LocationRepository locationRepository;

    @Override
    public void createMD(MDDTO data) {
        DecimalFormat df = new DecimalFormat("#.##");
        double average = (Arrays.stream(data.getTemperature()).sum())/4;
        MeteorologicData md = new MeteorologicData(data.getDate(),
                data.getLocation(),
                Double.parseDouble(df.format(average)));
        MDRepository.save(md);
    }

    @Override
    public List<MeteorologicData> getData() {
        return MDRepository.findAll();
    }

    @Override
    public MeteorologicData getMeteorologicalDataById(Long id) {
        Optional<MeteorologicData> opt = MDRepository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        } else {
            throw new MDNotFoundException();
        }
    }

    @Override
    public void updateMD(MeteorologicData data) {
        MDRepository.save(data);
    }

    @Override
    public void deleteMD(Long id) {
        MDRepository.delete(getMeteorologicalDataById(id));
    }
}
