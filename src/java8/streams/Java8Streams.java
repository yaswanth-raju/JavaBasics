package java8.streams;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
    public static void main(String[] args) {
        List<Employee> employeeArrayList= EmployeeUtil.getEmployees();
        System.out.println("Initial employeeArrayList"+ employeeArrayList.size());

//        forEachUpdateSalary(employeeArrayList);
        mapEmployeNamesStartWithA(employeeArrayList);
        sortBySalary(employeeArrayList);

//        System.out.println("Final employeeArrayList"+ employeeArrayList);
    }

    private static void mapEmployeNamesStartWithA(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e->e.getName().startsWith("A")) //only char case
                .map(e->e.getName())    //Map obj to name
                .forEach(System.out::println);
    }
    private static void sortBySalary(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .sorted((e2,e1)->e1.getSalary().compareTo(e2.getSalary()))
                .forEach(System.out::print);
    }


    //update bonus salary with for each
    private static void forEachUpdateSalary(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e->e.getSalary()<15000)   //Whose salaray less than 15K
                .forEach(e -> e.setSalary(e.getSalary() + 2000));   //update bonus salary with 2K;no need to save to other object
        System.out.println("Employees after update salary => "+employeeArrayList);
    }
}

