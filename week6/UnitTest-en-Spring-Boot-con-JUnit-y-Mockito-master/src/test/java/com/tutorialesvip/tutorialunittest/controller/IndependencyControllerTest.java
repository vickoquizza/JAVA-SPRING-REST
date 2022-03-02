package com.tutorialesvip.tutorialunittest.controller;

import com.tutorialesvip.tutorialunittest.models.Country;
import com.tutorialesvip.tutorialunittest.models.CountryResponse;
import com.tutorialesvip.tutorialunittest.repositories.CountryRepository;
import com.tutorialesvip.tutorialunittest.util.DiferenciaEntreFechas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IndependencyControllerTest {

    @Autowired
    CountryResponse countryResponse;

    @Autowired
    Optional<Country> country;

    CountryRepository countryRepository = Mockito.mock(CountryRepository.class);

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas = new DiferenciaEntreFechas();

    @Autowired
    IndependencyController independencyController = new IndependencyController(countryRepository,diferenciaEntreFechas);

    @BeforeEach
    void setUp() {
        Country mockCountry = new Country();
        mockCountry.setIsoCode("DO");
        mockCountry.setCountryName("Republica Dominicana");
        mockCountry.setCountryId((long) 1);
        mockCountry.setCountryCapital("Santo Domingo");
        mockCountry.setCountryIdependenceDate("27/02/1844");


        Mockito.when(countryRepository.findCountryByIsoCode("DO")).thenReturn(mockCountry);
    }

    @Test
    void getCountryDetails() {
        ResponseEntity<CountryResponse> respuestaTest = independencyController.getCountryDetails("DO");

        Assertions.assertEquals("Republica Dominicana", respuestaTest.getBody().getCountryName());
    }

}