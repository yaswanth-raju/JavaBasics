package java8.streams;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortingCollection {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeUtil.getEmployees();
        sortBySalary(employeeList);
        sortByName(employeeList);
    }
    private static void sortByName(List<Employee> employeeArrayList) {
        Comparator<Employee> comparator = (a, b)->a.getName().compareTo(b.getName());
        employeeArrayList.stream()
                .sorted(comparator)
                .forEach(System.out::print);
    }
    private static void sortBySalary(List<Employee> employeeArrayList) {
        Comparator<Employee> salaryComparator=Comparator.comparing(Employee::getSalary);
        employeeArrayList.stream()
                .sorted(salaryComparator)
                .forEach(System.out::print);
    }
}
