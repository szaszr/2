package org.ucode.lesson13;

public class Student {

    private String name;
    private Integer finalGrade;

    public Student(String name, Integer finalGrade) {
        this.name = name;
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Integer finalGrade) {
        this.finalGrade = finalGrade;
    }
}
