package com.vicko.HelloWorldMVC.Repositories;

import com.vicko.HelloWorldMVC.Models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
