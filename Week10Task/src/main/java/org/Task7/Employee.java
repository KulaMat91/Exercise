package org.Task7;

public class Employee {
    private String name;
    private Integer id;
    private Integer salary;

    public Employee(String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ " + name + " " + id + " " + salary + " }";
    }
}
