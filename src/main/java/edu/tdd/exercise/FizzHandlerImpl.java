package edu.tdd.exercise;

public class FizzHandlerImpl extends AbstractFizzBuzzHandler{
    @Override
    public String handle(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return super.nextHandle(number);
    }
}
