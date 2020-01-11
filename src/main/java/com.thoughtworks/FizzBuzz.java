package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    private Modulo modulo3 = new Modulo(3, FIZZ);
    private Modulo modulo5 = new Modulo(5, BUZZ);
    private Modulo modulo7 = new Modulo(7, WHIZZ);

    public String fizzBuzz(int number) {
        if (contains5(number)) {
            Rule rule6 = new Rule(modulo5, modulo7);
            if (rule6.match(number)) {
                return rule6.apply(number);
            }
        }
        if (contains3(number)) {
            return FIZZ;
        }
        Rule rule2And3 = new Rule(modulo3, modulo5, modulo7);
        if (rule2And3.match(number)) {
            return rule2And3.apply(number);
        }
        return String.valueOf(number);
    }

    private boolean contains5(int number) {
        return String.valueOf(number).contains("5");
    }

    private boolean contains3(int number) {
        return String.valueOf(number).contains("3");
    }

}
