package java8.QandA;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Top5Employees {
    public static void main(String[] args) {
        new Top5Employees().top5List();

    }

    private void top5List() {
        List<Employee> list = EmployeeUtil.getEmployees();
        list = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(list);
    }
}
