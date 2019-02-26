/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JFrame;

/**
 *
 * @author aashgar
 */
public class LoginFrameApp {
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame("Login Screen");        
        loginFrame.setSize(500, 400);
        loginFrame.setResizable(false);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
    
}
