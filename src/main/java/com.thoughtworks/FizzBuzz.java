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
            ModuloRule rule6 = new ModuloRule(modulo5, modulo7);
            if (rule6.match(number)) {
                return rule6.apply(number);
            }
        }
        ContainsRule rule4And5 = new ContainsRule("3");
        if (rule4And5.match(number)) {
            return FIZZ;
        }
        ModuloRule rule2And3 = new ModuloRule(modulo3, modulo5, modulo7);
        if (rule2And3.match(number)) {
            return rule2And3.apply(number);
        }
        return String.valueOf(number);
    }

    private boolean contains5(int number) {
        return String.valueOf(number).contains("5");
    }

}
