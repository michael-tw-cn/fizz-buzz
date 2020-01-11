package com.thoughtworks;

public class FizzBuzz {
    public String fizzbuzz(int number) {
        if (canModuloBy3(number) && canModuloBy5(number) && canModuloBy7(number)) {
            return "FizzBuzzWhizz";
        }
        if (canModuloBy3(number) && canModuloBy5(number)) {
            return "FizzBuzz";
        }
        if (canModuloBy5(number) && canModuloBy7(number)) {
            return "BuzzWhizz";
        }
        if (canModuloBy3(number) && canModuloBy7(number)) {
            return "FizzWhizz";
        }
        if (canModuloBy3(number)) {
            return "Fizz";
        }
        if (canModuloBy5(number)) {
            return "Buzz";
        }
        if (canModuloBy7(number)) {
            return "Whizz";
        }
        return "1";
    }

    private boolean canModuloBy7(int number) {
        return number % 7 == 0;
    }

    private boolean canModuloBy5(int number) {
        return number % 5 == 0;
    }

    private boolean canModuloBy3(int number) {
        return number % 3 == 0;
    }
}
