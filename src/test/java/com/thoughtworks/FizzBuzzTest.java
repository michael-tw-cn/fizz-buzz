package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private void assertFizzBuzz(int input, String expect) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbuzz(input);
        assertThat(result, is(expect));
    }

    @Test
    public void should_return_input_number_when_no_rules_matched() {
        assertFizzBuzz(1, "1");
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
}
