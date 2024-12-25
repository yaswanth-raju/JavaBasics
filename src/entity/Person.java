package entity;

public class Person implements Cloneable{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        // Returning a clone of the current object
        return (Person) super.clone();
    }
}