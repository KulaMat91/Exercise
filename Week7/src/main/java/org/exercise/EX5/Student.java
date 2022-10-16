package org.exercise.EX5;

import java.util.List;
import java.util.Map;

public class Student extends Person{
    private SchoolClass schoolClass;
    private Map<Subject, List<Integer>> grades;

    public Student(Integer id, String name, String surname, Integer yearOfBirth, SchoolClass schoolClass, Map<Subject, List<Integer>> grades) {
        super(id, name, surname, yearOfBirth);
        this.schoolClass = schoolClass;
        this.grades = grades;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public Map<Subject, List<Integer>> getGrades() {
        return grades;
    }
}
