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
import java.util.stream.Collectors;

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
            new Student("Iman", "PRG", 100.00),
            new Student("Wlaa", "CB", 82.3),
            new Student("Wlaa", "IS", 82.3),
            new Student("Amal", "ENG", 60.77),
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
        
       System.out.println("\nThe Average of all grades"); 
        System.out.println(avg);
        
        System.out.println("\nSorted Students"); 
        studentsList.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out:: println);
        
        System.out.println("\nStdents with grade 60 to 80"); 
        studentsList.stream()
                .filter(s -> {
                    if(s.getGrade() > 60 && s.getGrade() <= 80)
                        return true;
                    else
                        return false;
                })
                .forEach(System.out:: println);
        System.out.println("\nSorting by name then by major");
      studentsList.stream()
              .sorted(Comparator.comparing(Student::getName)
              .thenComparing(Student::getMajor))
              .forEach(System.out:: println);
        
      System.out.println("\nGrouping by Major");
      studentsList.stream()
              .collect(Collectors.groupingBy(Student::getMajor))
              .forEach((major,studMajor)->{
              System.out.println(major);
              studMajor.forEach(student -> 
                      System.out.printf("%30s\n",student));
              });
      System.out.println("\nCounting number of students in Major");
      studentsList.stream()
              .collect(Collectors.groupingBy(Student::getMajor,
                      Collectors.counting()))
              .forEach((major,count)->{
                  System.out.println("Major: " + major +
                          " Has count of: " + count);
                  
              });
    }
    
}
