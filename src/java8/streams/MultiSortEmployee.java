package java8.streams;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MultiSortEmployee {
    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("John", 50000, 28));
//        employees.add(new Employee("Jane", 60000, 25));
//        employees.add(new Employee("Doe", 50000, 30));
//        employees.add(new Employee("Alice", 70000, 28));
//        employees.add(new Employee("Bob", 50000, 25));
        List<Employee> employees = EmployeeUtil.getEmployees();
        employees.sort(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary));

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
