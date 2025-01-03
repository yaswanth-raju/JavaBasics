package entity;

public class Student{
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