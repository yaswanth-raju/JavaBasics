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
        minMaxSalary(employeeList);
    }
    private static void sortByName(List<Employee> employeeArrayList) {
        Comparator<Employee> comparator = (a, b)->a.getName().compareTo(b.getName());
        employeeArrayList.stream()
                .sorted(comparator)
                .forEach(System.out::print);
    }
   static Comparator<Employee> salaryComparator = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());
    private static void sortBySalary(List<Employee> employeeArrayList) {

        employeeArrayList.stream()
                .sorted(salaryComparator)
                .forEach(System.out::print);
    }
    private static void minMaxSalary(List<Employee> employeeArrayList) {

        Optional<Employee> maxSalary = employeeArrayList.stream()
                .max(salaryComparator);
        Optional<Employee> minSalary = employeeArrayList.stream()
                .min(salaryComparator);
        Employee minSalaryEmp = minSalary.isPresent() ? minSalary.get() : null;
        Employee employee = maxSalary.isPresent() ? maxSalary.get() : null;
        System.out.println("\n min salary = name = " + minSalaryEmp.getName() + " salary = " + minSalaryEmp.getSalary());
        System.out.println("\n max salary = name = " + employee.getName() + " salary = " + employee.getSalary());
    }
}
