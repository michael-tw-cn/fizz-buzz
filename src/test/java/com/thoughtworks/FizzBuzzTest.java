package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_input_number_when_no_rules_matched() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzz(1);
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_fizz_when_number_can_divide_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzz(3);
        assertThat(result, is("Fizz"));
    }
}
