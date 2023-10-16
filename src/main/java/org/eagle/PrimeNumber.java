package org.eagle;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> givePrimeNumber(int start, int end){
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for (int number = start; number<=end; number++ ){
            boolean divisible = false;
            if(number<2){
                divisible=true;
            }else {
                for (int dividing = 2; dividing<number; dividing++){
                    if (number % dividing ==0) divisible=true;
                }
            }

            if (divisible==false)primeNumbers.add(number);
        }
        return primeNumbers;
    }
}
