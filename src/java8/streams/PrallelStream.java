package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
class Student{
    int id;
    String name;
    String department;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;

    }
}