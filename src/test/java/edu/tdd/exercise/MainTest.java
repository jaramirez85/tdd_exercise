package edu.tdd.exercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void main(int number) {
        System.out.println("number = " + number);
        Main.main(new String[]{});
        assertThat(true).isTrue();
        assertThat(Math.abs(number)).isGreaterThan(0);
    }

}