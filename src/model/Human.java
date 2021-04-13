package model;

public class Human implements Comparable<Human>{
    private String firstname;
    private String lastname;

    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void shout() {
        System.out.println("Unga bunga");
    }

    @Override
    public int compareTo(Human o) {
        return 0;
    }
}
