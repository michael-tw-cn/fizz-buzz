package com.thoughtworks;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    private static final Candidate CANDIDATE_3 = new Candidate(3, FIZZ);
    public static final Candidate CANDIDATE_5 = new Candidate(5, BUZZ);
    public static final Candidate CANDIDATE_7 = new Candidate(7, WHIZZ);
    private Modulo modulo3 = new Modulo(CANDIDATE_3);
    private Modulo modulo5 = new Modulo(CANDIDATE_5);
    private Modulo modulo7 = new Modulo(CANDIDATE_7);

    public String fizzBuzz(int number) {
        ContainsRule containsRule7 = new ContainsRule(CANDIDATE_7);
        if (containsRule7.match(number)) {
            ModuloRule moduloRule = new ModuloRule(modulo3, modulo7);
            if (moduloRule.match(number)) {
                return moduloRule.apply(number);
            }
        }
        Rule containsRule6 = new ContainsRule(CANDIDATE_5);
        if (containsRule6.match(number)) {
            ModuloRule moduloRule = new ModuloRule(modulo5, modulo7);
            if (moduloRule.match(number)) {
                return moduloRule.apply(number);
            }
        }
        Rule rule4And5 = new ContainsRule(CANDIDATE_3);
        if (rule4And5.match(number)) {
            return rule4And5.apply(number);
        }
        Rule rule2And3 = new ModuloRule(modulo3, modulo5, modulo7);
        if (rule2And3.match(number)) {
            return rule2And3.apply(number);
        }
        return String.valueOf(number);
    }

}
