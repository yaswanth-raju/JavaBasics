package java8.LamdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaExpression1 {
    int val =10;
    public static void main(String[] args) {
        List<String>    list = new ArrayList<>();
        list.add("Raju");
        list.add("Kumar");
        list.add("Sahu");
        list.add("Poli");
        list.add("Anji");
//        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::println);
//        sortedList.stream().collect(Collectors.toMap(e->e.substring(2),e->e))
//                .forEach((e1,e2)->System.out.println(e1+"="+e2));
        String reduce = list.stream().reduce("Data = ", String::concat);

        System.out.println("val="+reduce);
        Integer outint = Arrays.asList(1,2,3,4,5,6,7).stream().reduce(100,Integer::max);
        System.out.println("outint="+outint);

    }
}

abstract class Abclass{
    abstract void fun();
}