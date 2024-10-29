package edu.tdd.exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzbuzzGenerator {

    private final FizzBuzzHandler fizzBuzzHandler;

    public FizzbuzzGenerator() {
        this.fizzBuzzHandler = AbstractFizzBuzzHandler.link(new FizzBuzzHandlerImpl(),
                new FizzHandlerImpl(),
                new BuzzHandlerImpl(),
                new NumberHandlerImpl()
        );
    }

    public List<String> generate(int number) {

        // validation No necessary
        /*if (number <= 0) {
            return Collections.emptyList();
        }*/

        return IntStream.range(1, number + 1)
                .mapToObj(fizzBuzzHandler::handle)
                .collect(Collectors.toList());
    }

}
