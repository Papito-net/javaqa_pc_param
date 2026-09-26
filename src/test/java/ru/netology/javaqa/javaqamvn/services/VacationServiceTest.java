
package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/month.csv")
    public void testExample1(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        /* int income = 10000;
        int expenses = 3000;
        int threshold = 20000;*/

        int result = service.calculate(income, expenses, threshold);
        assertEquals(expected, result);
    }
}

