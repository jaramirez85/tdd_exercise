package edu.tdd.exercise;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

///# Ejercicio FizzBuzz
///
/// El ejercicio FizzBuzz es un clásico en entrevistas técnicas y consiste en lo siguiente:
///
/// ## Descripción
///
/// Escribe un programa que imprima los números del 1 a un número N (dónde N es mayor a cero).
/// Pero para múltiplos de 3 imprime "Fizz" en lugar del número y para los múltiplos de 5 imprime "Buzz". Para los números que son múltiplos de ambos 3 y 5, imprime "FizzBuzz".
///
/// ### Requisitos
///
/// - Imprime los números del 1 al 100.
/// - Para los números que son múltiplos de 3, imprime `Fizz` en lugar del número.
/// - Para los números que son múltiplos de 5, imprime `Buzz` en lugar del número.
/// - Para los números que son múltiplos de ambos (de 3 y 5), imprime `FizzBuzz` en lugar del número.
///
/// ### Ejemplo de salida
/// ```
/// 1
/// 2
/// Fizz
/// 4
/// Buzz
/// Fizz
/// 7
/// 8
/// Fizz
/// Buzz
/// 11
/// Fizz
/// 13
/// 14
/// FizzBuzz
/// 16
/// ...
/// ```
public class FizzbuzzTest {

    @Test
    public void givenZeroThenReturnsEmptyList(){

        FizzbuzzGenerator generator = new FizzbuzzGenerator();
        List<String> result = generator.generate(0);
        assertThat(result).isEqualTo(Collections.emptyList());

    }

    @Test
    public void givenOneThenReturnsListWithoutFizz(){

        FizzbuzzGenerator generator = new FizzbuzzGenerator();
        List<String> result = generator.generate(1);
        assertThat(result).isEqualTo(List.of("1"));

    }

    @Test
    public void givenThreeThenReturnsListWitFizz(){

        FizzbuzzGenerator generator = new FizzbuzzGenerator();
        List<String> result = generator.generate(3);
        assertThat(result).isEqualTo(List.of("1", "2", "Fizz"));

    }

    @Test
    public void givenFiveThenReturnsListWitFizzAndBuzz(){

        FizzbuzzGenerator generator = new FizzbuzzGenerator();
        List<String> result = generator.generate(5);
        assertThat(result).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"));

    }

    @ParameterizedTest
    @MethodSource("generateTestData")
    public void givenANumberThenReturnsListWithFizzBuzz(int number, List<String> expected){
        FizzbuzzGenerator generator = new FizzbuzzGenerator();
        List<String> result = generator.generate(number);
        assertThat(result).isEqualTo(expected);
    }

    public static Stream<Arguments> generateTestData(){
        return Stream.of(
                Arguments.of(15, List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
        );

    }

}
