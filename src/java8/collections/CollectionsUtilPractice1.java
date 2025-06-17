package java8.collections;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.List;

public class CollectionsUtilPractice1 {
    public static void main(String[] args) {
        updateAllEmployeeNames();
    }
    public static void updateAllEmployeeNames(){
        List<Employee> employeesList = EmployeeUtil.getEmployees();
        employeesList.forEach(emp -> emp.setName("sameName"));
        System.out.println(employeesList);
    }
}
