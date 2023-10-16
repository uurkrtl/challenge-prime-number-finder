package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberTest {
    @Test
    void givenIntegerStartAndEnd_whenPrimeNumberFinde_thenReturnPrimeNumber(){
        PrimeNumber primeNumber = new PrimeNumber();
        List<Integer> expected = new ArrayList<>(Arrays.asList(11,13,17,19));
        List<Integer> actual = primeNumber.givePrimeNumber(10,20);
        Assertions.assertEquals(expected,actual);
    }
}
