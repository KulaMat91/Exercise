package org.OPPTask.Task2;

public class Staff extends Person {
    private String specialization;
    private Double salary;


    public Staff(String name, String address, String specialization, Double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }


    public String getSpecialization() {
        return specialization;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "Address: " + super.getAddress() + "\nSpecializations" + specialization +
                "\nSalary" + salary;
    }
}


