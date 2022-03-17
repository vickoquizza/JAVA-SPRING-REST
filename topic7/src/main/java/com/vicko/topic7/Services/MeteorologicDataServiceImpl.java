package com.vicko.topic7.Services;

import com.vicko.topic7.Exceptions.MDNotFoundException;
import com.vicko.topic7.Models.Location;
import com.vicko.topic7.Models.MeteorologicData;
import com.vicko.topic7.Repositories.LocationRepository;
import com.vicko.topic7.Repositories.MeteorologicDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class MeteorologicDataServiceImpl implements IMeteorologicDataService{

    private final MeteorologicDataRepository MDRepository;
    private final LocationRepository locationRepository;

    @Override
    public void createMD(MeteorologicData data) {
        MDRepository.save(data);
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
