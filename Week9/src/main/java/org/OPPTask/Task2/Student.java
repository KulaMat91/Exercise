package org.OPPTask.Task2;

public class Student extends Person{
    private Integer studyYear;
    private String studyType;
    private Integer studyCost;



    public Student(String name, String address, Integer studyYear, String studyType, Integer studyCost) {
        super(name, address);
        this.studyYear = studyYear;
        this.studyType = studyType;
        this.studyCost = studyCost;
    }

    public void setStudyYear(Integer studyYear) {
        this.studyYear = studyYear;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public void setStudyCost(Integer studyCost) {
        this.studyCost = studyCost;
    }

    public Integer getStudyYear() {
        return studyYear;
    }

    public String getStudyType() {
        return studyType;
    }

    public Integer getStudyCost() {
        return studyCost;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "Address: " + super.getAddress() + "\nStudy Type" + studyType +
                "\nStudy Year" + studyYear + "\nStudy cost" + studyCost;
    }
}
