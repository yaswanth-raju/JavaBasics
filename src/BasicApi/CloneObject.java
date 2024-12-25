package BasicApi;

import entity.Person;

public class CloneObject {
    public static void main(String[] args) {
        Person person1= new Person("raja");
        System.out.println("Before: " + person1.name);
        System.out.println("Identity Hash Code: " + System.identityHashCode(person1)); // Identity Hash Code

        try {
            Person person12= person1;
//                    person1.clone();
            person12.name="kumar";
            System.out.println("Before: " + person12.name);
            System.out.println("Identity Hash Code: " + System.identityHashCode(person12)); // Identity Hash Code

            System.out.println("Before: " + person1.name);
            System.out.println("Identity Hash Code: " + System.identityHashCode(person1)); // Identity Hash Code

        }
//        catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        catch (Exception ex){

        }
    }

}
