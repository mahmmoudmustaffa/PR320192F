/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author aashgar
 */
public class mainAppStudent {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Wlaa", "CS", 82.3),
            new Student("Alaa", "IS", 79.3),
            new Student("Zahra", "ART", 99.1),
            new Student("Ghada", "ENG", 60.77),
            new Student("Iman", "PRG", 100.00)          
        };
        List<Student> studentsList = 
                new ArrayList<>(Arrays.asList(students));
//        Collections.sort(studentsList,new Comparator<Student>() {
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        
//        for(Student student: studentsList)
//            System.out.println(student);
       System.out.println("The list of students");
        studentsList.stream()
                .forEach(System.out:: println);
        
       double avg = studentsList.stream()
                .mapToDouble(Student:: getGrade)
                .average()
                .getAsDouble();
        
       System.out.println("The Average of all grades"); 
        System.out.println(avg);
        
        System.out.println("Sorted Students"); 
        studentsList.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out:: println);
        System.out.println("Stdents with grade >= 80"); 
        studentsList.stream()
                .filter(s -> {
                    if(s.getGrade() > 60 && s.getGrade() <= 80)
                        return true;
                    else
                        return false;
                })
                .forEach(System.out:: println);
        
        
    }
    
}
