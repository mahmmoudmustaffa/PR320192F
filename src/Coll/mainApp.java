/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author aashgar
 */
public class mainApp {
    public static void main(String[] args) {
        String[] names = {"Zakaria", "Marwa", "Ahmad","Ali"};
        ArrayList<String> namesList = 
                new ArrayList<>(Arrays.asList(names));
        Collections.sort(namesList);
        System.out.println(namesList);
        System.out.println(Collections.min(namesList));
    }
    
}
