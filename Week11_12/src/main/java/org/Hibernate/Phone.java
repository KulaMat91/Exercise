package org.Hibernate;

import javax.persistence.*;

@Entity

public class Phone {

    enum PhoneBrand {
        NOKIA, SAMSUNG, MOTOROLA;
    }

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    @Enumerated(EnumType.STRING)
    private PhoneBrand phoneBrand;

    @Column
    private String model;

    @OneToOne(mappedBy = "phone")
    private Employee employee;

    public Phone() {

    }


    public Phone(PhoneBrand phoneBrand, String model) {
        this.phoneBrand = phoneBrand;
        this.model = model;
    }

    public PhoneBrand getPhoneBrand() {
        return phoneBrand;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhoneBrand(PhoneBrand phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Phone{id = " + id + ", phoneBrand=" + phoneBrand +
                ", model= " + model +
                " }";
    }
}
