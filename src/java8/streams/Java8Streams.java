package java8.streams;

import entity.Employee;
import jdk.jshell.execution.Util;
import util.Utility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Streams {



    public static void main(String[] args) {
        List<Employee> employeeArrayList = Utility.getEmployesList();
        System.out.println("Initial employeeArrayList" + employeeArrayList.size());
        mapEmployeNamesStartWithA(employeeArrayList);
        forEachUpdateSalary(employeeArrayList);
        employeeArrayList.stream().forEach(System.out::println);
//        employeeArrayList.stream().map(e->e.getName()).forEach(e->e.get);
//        employeeArrayList.stream().filter(r->r.getName().isEmpty()).map(emp->mapToMy()).collect(Collectors.toList());
    }
    Employee mapToMy(List<Employee> list){
//list.stream().map(o->o.getName()).collect(Collectors.groupingBy(Function.identity(),))
        return  null;
    }
    private static void mapEmployeNamesStartWithA(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e -> e.getName().startsWith("A")) //only char case
                .map(e -> e.getName().concat(" ram"))    //Map obj to name
                .forEach(System.out::println);

        List<String> list = employeeArrayList.stream()
                .filter(e -> e.getName().startsWith("A")) //only char case
                .map(e -> e.getName().concat(" ram")).collect(Collectors.toList());
    }
    //update bonus salary with for each
    private static void forEachUpdateSalary(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e -> e.getSalary() < 15000)   //Whose salaray less than 15K
                .forEach(e -> e.setSalary(e.getSalary() + 2000));   //update bonus salary with 2K;no need to save to other object
        System.out.println("Employees after update salary => " + employeeArrayList);
    }


}

