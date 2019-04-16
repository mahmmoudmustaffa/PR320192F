/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coll;

/**
 *
 * @author aashgar
 */
public class Student {
    private String name;
    private String major;
    private double grade;

    public Student() {
        new Student("", "", 0);
    }

    public Student(String name, String major, double grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-8s %8.2f", getName(),
                getMajor(),getGrade());
    }
    
    
}
