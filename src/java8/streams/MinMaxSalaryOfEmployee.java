package java8.streams;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeUtil.getEmployees();
        minMaxSalary(employeeList);
    }
    static Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);
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
