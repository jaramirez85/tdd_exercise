package edu.tdd.exercise;

public class FizzBuzzHandlerImpl extends AbstractFizzBuzzHandler{
    @Override
    public String handle(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        return super.nextHandle(number);
    }
}
