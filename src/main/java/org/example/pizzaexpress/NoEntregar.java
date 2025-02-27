package org.example.pizzaexpress;

public class NoEntregar extends RuntimeException {
    public NoEntregar() {
        super("La pizza todavia no esta lista.");
    }
}
