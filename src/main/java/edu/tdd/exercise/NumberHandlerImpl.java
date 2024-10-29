package edu.tdd.exercise;

public class NumberHandlerImpl extends AbstractFizzBuzzHandler{
    @Override
    public String handle(int number) {
        return String.valueOf(number);
    }
}
