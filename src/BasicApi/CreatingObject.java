package BasicApi;

import entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CreatingObject {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {

        Constructor<?> constructor = Employee.class.getConstructor();
        Employee emp0 = (Employee) constructor.newInstance();
        emp0.setName("nani");
        System.out.println("emp0 obj"+emp0);

        Constructor<?> constructor2 = Class.forName("entity.Employee").getConstructors()[1];
        Employee emp = (Employee) constructor2.newInstance();   //new instance  check at runtime
        emp.setName("rama");
        System.out.println("emp obj"+emp);

        new CreatingObject().updateSalary(emp);
        System.out.println("emp obj"+emp);

        Employee emp2 = Employee.class.newInstance();   //Creating using depricated method

    }
    void updateSalary(Employee empl){
        empl.setSalary(23000);
    }
}
