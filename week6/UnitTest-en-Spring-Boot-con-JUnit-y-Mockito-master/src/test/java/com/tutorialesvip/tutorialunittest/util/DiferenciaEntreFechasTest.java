package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    private DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        LocalDate today = LocalDate.now();
        String IndependenceDay = "20/06/1811";

        Period resultadoEsperado = Period.between(LocalDate.parse(IndependenceDay, DateTimeFormatter.ofPattern("d/MM/yyyy")), today);

        Assertions.assertEquals(resultadoEsperado, diferenciaEntreFechas.calculateYearsOfIndependency(IndependenceDay));
        Assertions.assertEquals(9, diferenciaEntreFechas.calculateYearsOfIndependency(IndependenceDay).getDays());
    }
}