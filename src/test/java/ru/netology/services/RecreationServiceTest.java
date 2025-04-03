package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RecreationServiceTest {

    @Test
    public void testVacationCalculation() {
        RecreationService service = new RecreationService();

        int expected = 3;
        int actual = service.calcRecreation(3, 10_000, 3_000, 20_000 );


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacationCalculationTwo() {
        RecreationService service = new RecreationService();

        int expected = 2;
        int actual = service.calcRecreation(2, 100_000, 60_000, 150_000 );


        Assertions.assertEquals(expected, actual);
    }

}

