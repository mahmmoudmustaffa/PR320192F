/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

/**
 *
 * @author aashgar
 */
public class mainApp2 {
    public enum Directions {R,L,N,S};

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ahmad");
        s1.setGrade(88);
         Student.setCount(1);
        System.out.println("Student Data: " +s1.getName() 
                + " --- " + s1.getGrade());
        Student.setCount(2);
        System.out.println("Count = "+ Student.getCount());
        
       
    }  
    
    private static class Student {
    private String name;
    private int grade;
    private static int count;

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            Student.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    
}
}
