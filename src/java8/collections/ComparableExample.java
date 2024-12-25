package java8.collections;

import collections_util.EmployeeUtil;
import entity.Employee;

import java.util.*;

public class ComparableExample{
    public static void main(String[] args) {
//        HashSet<Employee> list2 = new HashSet<Employee>();
        TreeSet<Employee> list = new TreeSet<Employee>();
        list.addAll( EmployeeUtil.getEmployees());
        System.out.println(list);
    }
}
