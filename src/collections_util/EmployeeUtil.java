package collections_util;

import entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {
    public static List<Employee> getEmployees(){
        Employee emp = new Employee(1,10000,"raja");
        Employee emp2 = new Employee(2,20000, "Kumar");
        Employee emp3 = new Employee(3,30000, "Apparao");
        Employee emp4 = new Employee(4,40000, "Somesh");
        Employee emp5 = new Employee(5,12000, "Polireddy");
        Employee emp6 = new Employee(6,30000, "Zafar");
        Employee emp7 = new Employee(7,90000, "appanna");
        return Arrays.asList(emp, emp2, emp3, emp4, emp5, emp6, emp7);
    }
}
