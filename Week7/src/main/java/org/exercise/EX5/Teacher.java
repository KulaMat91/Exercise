package org.exercise.EX5;

import java.util.List;

public class Teacher extends Person{
    private List<Subject> subjects;
    private SchoolClass schoolClass;


    public Teacher(Integer id, String name, String surname, Integer yearOfBirth, List<Subject> subjects) {
        super(id, name, surname, yearOfBirth);
        this.subjects = subjects;
    }


    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }
}
