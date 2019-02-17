/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author aashgar
 */
public class Student {
    private String name;
    private String major;
    private double grade;
    public static int count=0;

    public Student() {
        ++count;
    }

    public Student(String name, String major, double grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
        ++count;
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
    
    
    
    
}
