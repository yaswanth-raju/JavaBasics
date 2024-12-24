package java8.QandA;

import entity.Employee;
import util.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class Top5Employees {
    public static void main(String[] args) {
        new Top5Employees().top5List();

    }

    private void top5List() {
        List<Employee> list = Utility.getEmployesList();
        list = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(list);
    }
}
