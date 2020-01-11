package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input_number_when_no_rules_matched() {
        assertFizzBuzz(1, "1");
    }

    private void assertFizzBuzz(int number, String expected) {
        assertThat(fizzBuzz(number), is(expected));
    }

    @Test
    public void should_return_fizz_when_number_can_divide_3() {
        assertFizzBuzz(3, "Fizz");
    }

    @Test
    public void should_return_buzz_when_number_can_divide_5() {
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    public void should_return_whizz_when_number_can_divide_7() {
        assertFizzBuzz(7, "Whizz");
    }

    @Test
    public void should_return_fizzbuzz_when_number_can_divide_3_and_5() {
        assertFizzBuzz(15, "Buzz");
    }

    @Test
    public void should_return_buzzwhizz_when_number_can_divide_5_and_7() {
        assertFizzBuzz(35,"BuzzWhizz");
    }

    @Test
    public void should_return_fizzwhizz_when_number_can_divide_3_and_7 (){
        assertFizzBuzz(21, "FizzWhizz");
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_number_can_divide_3_and_5_and_7() {
        assertFizzBuzz(105, "BuzzWhizz");
    }

    @Test
    public void should_return_fizz_when_number_contains_3() {
        assertFizzBuzz(13, "Fizz");
    }

    @Test
    public void should_return_fizz_when_number_contains_3_and_number_can_divide_5() {
        assertFizzBuzz(30, "Fizz");
    }

    private String fizzBuzz(int i) {
        return fizzBuzz.fizzBuzz(i);
    }
}
