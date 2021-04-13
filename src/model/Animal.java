package model;

public class Animal implements Comparable<Animal> {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String noise() {
        return "Määäääh";
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
