package edu.tdd.exercise;

public abstract class AbstractFizzBuzzHandler implements FizzBuzzHandler {
    AbstractFizzBuzzHandler next;

    /**
     * Builds chains of AbstractFizzBuzzHandler objects.
     */
    public static FizzBuzzHandler link (AbstractFizzBuzzHandler first, AbstractFizzBuzzHandler... chain){
        AbstractFizzBuzzHandler head = first;
        for (AbstractFizzBuzzHandler nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected String nextHandle(int number) {
        if (next != null) {
            return next.handle(number);
        }
        return null;
        //return new NumberHandlerImpl().handle(number);
    }

}
