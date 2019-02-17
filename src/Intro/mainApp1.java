/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Scanner;

/**
 *
 * @author aashgar
 */
public class mainApp1 {
    public static void main(String[] args) {
        int balance;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance:");
        balance = Integer.parseUnsignedInt(
                scanner.next());
        
        System.out.println("Balance is: " +
                Integer.toUnsignedString(balance));
    }
    
}
