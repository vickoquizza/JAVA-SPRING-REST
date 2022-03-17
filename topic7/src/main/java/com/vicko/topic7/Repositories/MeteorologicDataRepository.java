package com.vicko.topic7.Repositories;

import com.vicko.topic7.Models.MeteorologicData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeteorologicDataRepository extends JpaRepository<MeteorologicData, Long> {
}
