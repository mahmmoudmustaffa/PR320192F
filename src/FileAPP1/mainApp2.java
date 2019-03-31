/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAPP1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class mainApp2 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ahmad", "CS", 88.7),
            new Student("Marwa", "IS", 88.7),
            new Student("Huda", "Art", 88.7)
        };
        try {
            ObjectOutputStream os= new ObjectOutputStream(
                    new FileOutputStream("./src/FileApp1/Student.ser"));
            for(Student student: students)
                os.writeObject(student);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
