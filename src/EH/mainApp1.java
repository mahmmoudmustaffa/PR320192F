/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EH;

import com.sun.org.apache.regexp.internal.REUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author aashgar
 */
public class mainApp1 {
    public static void main(String[] args) {
        
        int num1,num2, result;
   
        try{
        num1 = Integer.parseInt (JOptionPane.showInputDialog("Enter number 1:"));
        num2 = Integer.parseInt (JOptionPane.showInputDialog("Enter number 2:"));
        if(num2 == 0)
            throw new myException("Div By Zero");
        result = num1 / num2;
        System.out.println("result :" + result);
        }catch(ArithmeticException e){
            System.out.println("divide by zero.");
            throw new NullPointerException("NUll p e");
        }catch(NumberFormatException e){
            System.out.println("Error.");
        }catch(RuntimeException e){
            System.out.println("My exception");
        }finally{
            System.out.println("aa");
        }
            
    
    }
    private static class myException extends ArithmeticException{

        public myException(String msg) {
            super(msg);
        }
        
    }
    
}
