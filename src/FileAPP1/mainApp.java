/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAPP1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class mainApp {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(
                    new File("./src/FileApp1/student.txt"));
            //fileWriter.write("Ahmad CS 88.8\n");
            //fileWriter.write("Ghada Art 79.9\n");
            //fileWriter.write("Eman PRog 90.1\n");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Ahmad CS 88.8");
            printWriter.println("Ghada Art 79.9");
            printWriter.println("Eman IS 90.1");
            printWriter.close();
            fileWriter.close();
            
            FileReader fileReader = new FileReader(
                    new File("./src/FileApp1/student.txt"));
            //int i;
            //hile((i =fileReader.read()) != -1)
            //    System.out.print((char) i);
            ///fileReader.close();
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext())
                System.out.println(scanner.nextLine());
            
            scanner.close();
            
        } catch (IOException ex) {
        }
        
    }
    
}
