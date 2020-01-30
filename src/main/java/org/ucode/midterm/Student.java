package org.ucode.midterm;

public class Student {
    private String firstName;
    private String lastName;
    private String department;
    private int age;
    private double generalGrade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGeneralGrade() {
        return generalGrade;
    }

    public void setGeneralGrade(double generalGrade) {
        this.generalGrade = generalGrade;
    }

    Student(String firstName, String lastName, int age, String department, double generalGrade){
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.age = age;
        this.generalGrade = generalGrade;
    }
}
