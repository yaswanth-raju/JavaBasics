package collections;

import entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        Employee emp = new Employee(1,10000,"raja");
        Employee emp2 = new Employee(2,20000, "Kumar");
        Employee emp3 = new Employee(3,30000, "Apparao");
        Employee emp4 = new Employee(4,40000, "Somesh");
        Employee emp5 = new Employee(5,12000, "Polireddy");
        Employee emp6 = new Employee(6,30000, "Anji");
        Employee emp7 = new Employee(7,90000, "appanna");
        List<Employee> list = Arrays.asList(emp,emp2,emp3,emp4,emp5,emp6,emp7);
//        list.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary())).forEach(System.out::println);
        list.stream().collect(Collectors.groupingBy(Employee::getSalary));

    }
}
