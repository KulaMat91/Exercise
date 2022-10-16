package org.exercise.EX5;

import java.util.Comparator;
import java.util.List;

public class School implements TheYoungestStudent {
    private String schoolName;
    private List<SchoolClass> schoolClasses;
    private List<Teacher> TeacherList;

    @Override
    public Student findTheYoungestStudent() {
        return null;
    }

//    @Override
//    public Student findTheYoungestStudent() {
////        return schoolClasses.getClass()stream().max(Comparator.comparing(Student::getYearOfBirth)).get();
//    }
}
