package edu.tdd.exercise;

import java.util.ArrayList;
import java.util.List;

public class FizzbuzzGenerator {

    public List<String> generate(int number) {
        if(number <= 0){
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0){
                result.add("Fizz");
            }else {
                if(i % 5 == 0){
                    result.add("Buzz");
                }else{
                    result.add(String.valueOf(i));
                }
            }
        }
        return result;
    }

}
