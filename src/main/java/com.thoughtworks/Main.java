package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = new FizzBuzz().fizzBuzz(i+1);
            System.out.println(result);
        }
    }
}
