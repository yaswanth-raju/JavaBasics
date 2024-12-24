package java8.streams;

import entity.Employee;
import util.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MapFlatMap {
    public static void main(String[] args) {
        List<Employee> employeeArrayList = Utility.getEmployesList();
        List<List<Employee>> listOfList = Arrays.asList(employeeArrayList.subList(1,6)
                                        ,employeeArrayList.subList(2,5)
                                        ,employeeArrayList.subList(5,7));
        listOfList.stream().forEach(System.out::println);
        listOfList.stream()
                .flatMap(e->
                        e.stream()
                        .filter(Predicate.not(z->z.getName().isEmpty()))
                )
                .forEach(System.out::println);
    }
}
