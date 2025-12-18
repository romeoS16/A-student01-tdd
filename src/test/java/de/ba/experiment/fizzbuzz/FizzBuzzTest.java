package de.ba.experiment.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben

    @Test
    public void fizzBuzzOfThree() {
        String[] result = FizzBuzz.fizzBuzz(3);
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, result);
    }

    @Test
    public void fizzBuzzOfFour() {
        String[] result = FizzBuzz.fizzBuzz(4);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4"}, result);
    }

    @Test
    public void fizzBuzzOfFive() {
        String[] result = FizzBuzz.fizzBuzz(5);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, result);
    }

    @Test
    public void fizzBuzzOfFifteen() {
        String[] result = FizzBuzz.fizzBuzz(15);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz"}, result);
    }


    @Test (expected = IllegalArgumentException.class)
    public void fizzBuzzOfZeroIAE() {
        String[] result = FizzBuzz.fizzBuzz(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void fizzBuzzOfNegativeIAE() {
        String[] result = FizzBuzz.fizzBuzz(-1);
    }
}
