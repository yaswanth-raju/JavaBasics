package java8.streams;

import entity.Employee;

import java.util.Arrays;
import java.util.List;

public class Java8Streams {
    public static void main(String[] args) {
        List<Employee> employeeArrayList=updateEmpList();
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
    private static List<Employee> updateEmpList() {
        Employee emp = new Employee(1,10000,"raja");
        Employee emp2 = new Employee(2,20000, "Kumar");
        Employee emp3 = new Employee(3,30000, "Apparao");
        Employee emp4 = new Employee(4,40000, "Somesh");
        Employee emp5 = new Employee(5,12000, "Polireddy");
        Employee emp6 = new Employee(6,30000, "Anji");
        Employee emp7 = new Employee(7,90000, "appanna");
        List<Employee> employeeArrayList = Arrays.asList(new Employee[]{emp2, emp, emp3, emp4, emp5,emp6,emp7});
        return employeeArrayList ;
    }
}

