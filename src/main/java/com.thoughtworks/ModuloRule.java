package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ModuloRule {

    private List<Modulo> moduloes = new ArrayList<>();

    public ModuloRule(Modulo... moduloes) {
        this.moduloes.addAll(Arrays.asList(moduloes));
    }

    String apply(int number) {
        StringBuilder result = new StringBuilder();
        matchedModuloes(number).forEach(modulo -> result.append(modulo.getDescription()));
        return result.toString();
    }

    private Stream<Modulo> matchedModuloes(int number) {
        return moduloes.stream().filter(modulo -> modulo.canModuloBy(number));
    }

    public boolean match(int number) {
        return matchedModuloes(number).count() > 0;
    }
}