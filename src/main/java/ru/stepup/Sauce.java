package ru.stepup;

public class Sauce {
    private String name;
    Spicy spicy;

    public Sauce(String name, Spicy spicy) {
        this.name = name;
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spicy;
    }
}
