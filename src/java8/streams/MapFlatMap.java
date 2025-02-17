package java8.streams;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MapFlatMap {
    public static void main(String[] args) {
        List<Employee> employeeArrayList = EmployeeUtil.getEmployees();
        List<List<Employee>> listOfList = Arrays.asList(employeeArrayList.subList(1,6)
                                        ,employeeArrayList.subList(2,5)
                                        ,employeeArrayList.subList(5,7));
        listOfList.stream().forEach(System.out::println);
        listOfList.stream()
                .flatMap(e->
                        e.stream()
                        .filter(Predicate.not(z->z.getName().isEmpty()))
                                .map(item->item.getName())
                )

                .forEach(System.out::println);
    }
}
