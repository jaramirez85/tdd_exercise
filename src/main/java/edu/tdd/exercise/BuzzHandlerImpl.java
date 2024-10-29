package edu.tdd.exercise;

public class BuzzHandlerImpl extends AbstractFizzBuzzHandler{
    @Override
    public String handle(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return super.nextHandle(number);
    }
}
