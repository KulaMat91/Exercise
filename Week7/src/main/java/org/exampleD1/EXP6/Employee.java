package org.exampleD1.EXP6;

public class Employee {
    private final Identity identity;
    private Integer salary;
    private String role;
    private String department;

    public Employee(Integer id, String firstName, String secondName, Integer yearBorn, Integer salary, String role, String department) {
        this.identity = new Identity(id,firstName, secondName,yearBorn);
        this.salary = salary;
        this.role = role;
        this.department = department;
    }

    public Identity getIdentity() {
        return identity;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    //nested class

    public class Identity {
        private final Integer id;
        private final String firstName;
        private final String secondName;
        private final Integer yearBorn;


        public Identity(Integer id, String firstName, String secondName, Integer yearBorn) {
            this.id = id;
            this.firstName = firstName;
            this.secondName = secondName;
            this.yearBorn = yearBorn;
        }

        public Integer getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public Integer getYearBorn() {
            return yearBorn;
        }
    }
}
