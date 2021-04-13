package model;

public class Car implements Comparable<Car>{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Brumm");
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
