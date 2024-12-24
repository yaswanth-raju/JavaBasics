package entity;

public class Employee  implements Comparable<Employee>{

    Integer id;
    Integer salary;
    String name;

    @Override
    public String toString() {
        return "\n Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
    public Employee(){
        System.out.println("creating employee");
    }
    public Employee(Integer id, Integer salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getName().compareTo(employee.getName());
    }
}
