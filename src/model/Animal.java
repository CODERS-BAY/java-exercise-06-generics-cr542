package model;

public class Animal implements Comparable<Animal> {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void noise() {
        System.out.println("Määäääh");
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
