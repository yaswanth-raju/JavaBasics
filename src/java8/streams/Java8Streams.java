package java8.streams;

import entity.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Streams {

    static Comparator<Employee> comparator = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());

    public static void main(String[] args) {
        List<Employee> employeeArrayList = updateEmpList();
        System.out.println("Initial employeeArrayList" + employeeArrayList.size());


        mapEmployeNamesStartWithA(employeeArrayList);
        sortBySalary(employeeArrayList);
        minMaxSalary(employeeArrayList);

        //        forEachUpdateSalary(employeeArrayList);
//        System.out.println("Final employeeArrayList"+ employeeArrayList);
    }

    private static void mapEmployeNamesStartWithA(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e -> e.getName().startsWith("A")) //only char case
                .map(e -> e.getName())    //Map obj to name
                .forEach(System.out::println);
    }

    private static void sortBySalary(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .sorted(comparator)
                .forEach(System.out::print);
    }

    private static void minMaxSalary(List<Employee> employeeArrayList) {

        Optional<Employee> maxSalary = employeeArrayList.stream()
                .max(comparator);
        Optional<Employee> minSalary = employeeArrayList.stream()
                .min(comparator);
        Employee minSalaryEmp = minSalary.isPresent() ? minSalary.get() : null;
        Employee employee = maxSalary.isPresent() ? maxSalary.get() : null;
        System.out.println("\n min salary = name = " + minSalaryEmp.getName() + " salary = " + minSalaryEmp.getSalary());
        System.out.println("\n max salary = name = " + employee.getName() + " salary = " + employee.getSalary());
    }

    //update bonus salary with for each
    private static void forEachUpdateSalary(List<Employee> employeeArrayList) {
        employeeArrayList.stream()
                .filter(e -> e.getSalary() < 15000)   //Whose salaray less than 15K
                .forEach(e -> e.setSalary(e.getSalary() + 2000));   //update bonus salary with 2K;no need to save to other object
        System.out.println("Employees after update salary => " + employeeArrayList);
    }

    private static List<Employee> updateEmpList() {
        Employee emp = new Employee(1, 10000, "raja");
        Employee emp2 = new Employee(2, 20000, "Kumar");
        Employee emp3 = new Employee(3, 30000, "Apparao");
        Employee emp4 = new Employee(4, 40000, "Somesh");
        Employee emp5 = new Employee(5, 12000, "Polireddy");
        Employee emp6 = new Employee(6, 30000, "Anji");
        Employee emp7 = new Employee(7, 90000, "appanna");
        List<Employee> employeeArrayList = Arrays.asList(new Employee[]{emp2, emp, emp3, emp4, emp5, emp6, emp7});
        return employeeArrayList;
    }
}

