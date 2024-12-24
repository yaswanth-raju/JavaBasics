package BasicApi;

import entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatingObject {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Constructor<?> conbstructor = Employee.class.getConstructor();
        Employee emp = (Employee) conbstructor.newInstance();
        emp.setName("raka");
        System.out.println("emp obj"+emp);
        new CreatingObject().updateSalary(emp);
        System.out.println("emp obj"+emp);
    }
    void updateSalary(Employee empl){
        empl.setSalary(23000);
    }
}
