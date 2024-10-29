package edu.tdd.exercise;

import java.util.ArrayList;
import java.util.List;

public class FizzbuzzGenerator {

    public List<String> generate(int number) {
        if(number <= 0){
            return new ArrayList<>();
        }
        return List.of(String.valueOf(number));
    }

}
