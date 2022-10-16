package org.exercise.EX5;

import java.util.Comparator;
import java.util.List;

public class SchoolClass implements TheYoungestStudent{
    private String classID;
    private List<Student> studentList;
    private Teacher leadTeacher;


    public SchoolClass(String classID, List<Student> studentList, Teacher leadTeacher) {
        this.classID = classID;
        this.studentList = studentList;
        this.leadTeacher = leadTeacher;
    }

    public String getClassID() {
        return classID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getLeadTeacher() {
        return leadTeacher;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Student findTheYoungestStudent() {
        return studentList.stream().max(Comparator.comparing(Student::getYearOfBirth)).get();
    }

}
