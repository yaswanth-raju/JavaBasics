package java8.streams;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class PrallelStream {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"raj","cse"));
        list.add(new Student(2,"kumar","it"));
        list.add(new Student(3,"raja","cse"));
        list.parallelStream().forEach(e->System.out.println(e+" ,"+Thread.currentThread()));
        System.out.println("\n Normal stream using single thread:");
        list.stream().forEach(e->System.out.println(e+" ,"+Thread.currentThread()));
    }
}