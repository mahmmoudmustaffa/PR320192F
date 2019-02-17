/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aashgar
 */
public class StudentApp {
    public static void main(String[] args) {
//        Student[] students = {
//            new Student("Ahmad", "CS", 90.1),
//            new Student("Huda", "Art", 77.8),
//            new Student("Ali", "Eng", 80.8)
//        };
        Student[] students = new Student[3];
//        Scanner scanner = new Scanner(System.in);
//       
//        for(int i=0; i<students.length; i++){
//            System.out.println("Enter student data");
//            Student s = new Student();
//            s.setName(scanner.next());
//            s.setMajor(scanner.next());
//            s.setGrade(scanner.nextDouble());
//            students[i] = s;
//        }
        for(int i=0; i<students.length; i++){
            System.out.println("Enter student data");
            Student s = new Student();
            s.setName(JOptionPane.
                    showInputDialog(null, "Enter student",
                            "Student " + i, JOptionPane.INFORMATION_MESSAGE));
            s.setMajor(JOptionPane.
                    showInputDialog(null, "Enter student",
                            "Student " + i, JOptionPane.INFORMATION_MESSAGE));
            s.setGrade(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Enter student",
                            "Student " + i, JOptionPane.INFORMATION_MESSAGE)));
            students[i] = s;
        }
     
        showData(students);
        for(int i=0; i<students.length; i++)
            for(int j=i+1; j<students.length; j++)
                if(students[j].getGrade() >
                        students[i].getGrade()){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
        
        showData(students);
    }
   public static void showData(Student[] students){
       System.out.println("=================");
       System.out.printf("%-10s%-10s%-13s\n","Name",
                "Major","Grade");
       //for(int i=0; i<students.length; i++)
        for(Student student:students)
            System.out.printf("%-10s%-10s%-10.2f\n",
                    student.getName(),
                    student.getMajor(),
                    student.getGrade());
   } 
}
