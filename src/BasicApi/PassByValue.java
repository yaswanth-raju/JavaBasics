package BasicApi;


import entity.Person;

public class PassByValue {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        System.out.println("Before: " + person1.name);
        System.out.println("Identity Hash Code: " + System.identityHashCode(person1)); // Identity Hash Code

        modifyObject(person1);
        System.out.println("After modifyObject: " + person1.name);
        System.out.println("Identity Hash Code: " + System.identityHashCode(person1)); // Identity Hash Code

        changeReference(person1);
        System.out.println("After changeReference: " + person1.name);
        System.out.println("Identity Hash Code: " + System.identityHashCode(person1)); // Identity Hash Code
    }

    public static void modifyObject(Person person) {
        System.out.println("Inside modifyObject - Identity Hash Code: " + System.identityHashCode(person)); // Identity Hash Code
        person.name = "Jane";
    }

    public static void changeReference(Person person) {
        System.out.println("Inside changeReference (before reassignment) - Identity Hash Code: " + System.identityHashCode(person)); // Identity Hash Code
        person = new Person("Doe");
        System.out.println("Inside changeReference (after reassignment) - Identity Hash Code: " + System.identityHashCode(person)); // Identity Hash Code of new object
        person.name = "Doe";
    }
}
