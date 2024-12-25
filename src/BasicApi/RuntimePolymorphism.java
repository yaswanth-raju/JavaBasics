package BasicApi;

interface Car {
    default void drive(){
        System.out.println("Driving some Car");
    }
}

interface Bus {
    default void drive(){
        System.out.println("Driving some Bus");
    }
}
class Vehicle implements Car{
    public void drive() {
        System.out.println("Driving some vehicle");
    }
}
public class RuntimePolymorphism  {
    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        vehicle.drive();


    }
}
