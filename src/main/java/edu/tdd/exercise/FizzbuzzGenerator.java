package edu.tdd.exercise;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzbuzzGenerator {

    public List<String> generate(int number) {
        if (number <= 0) {
            return Collections.emptyList();
        }

        return IntStream.range(1, number + 1)
                .mapToObj(i -> {
                    if (i % 3 == 0 && i % 5 == 0) {
                        return "FizzBuzz";
                    } else if (i % 3 == 0) {
                        return "Fizz";
                    } else if (i % 5 == 0) {
                        return "Buzz";
                    } else {
                        return String.valueOf(i);
                    }
                }).collect(Collectors.toList());
    }

}
