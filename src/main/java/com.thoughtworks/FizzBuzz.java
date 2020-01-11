package com.thoughtworks;

public class FizzBuzz {
    public String fizzbuzz(int number) {
        StringBuilder result = new StringBuilder();
        if (canModuloBy3(number)) {
            result.append("Fizz");
        }
        if (canModuloBy5(number)) {
            result.append("Buzz");
        }
        if (canModuloBy7(number)) {
            result.append("Whizz");
        }
        if (result.length() > 0) {
            return result.toString();
        }
        if (contains3(number)) {
            return "Fizz";
        }
        return "1";
    }

    private boolean contains3(int number) {
        return String.valueOf(number).contains("3");
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
