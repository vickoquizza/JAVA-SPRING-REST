package com.vicko.topic7.Repositories;

import com.vicko.topic7.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
