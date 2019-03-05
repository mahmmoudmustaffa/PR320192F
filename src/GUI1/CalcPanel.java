/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aashgar
 */
public class CalcPanel extends JPanel{
    private JButton[] keyButtons;
    private JTextField textFieldLCD;
    private JPanel keysPanel;

    public CalcPanel() {
        keysPanel = new JPanel(new GridLayout(4, 4));
        keyButtons = new JButton[16];
        for(int i=0; i<= 9; i++)
            keyButtons[i] = new JButton(String.valueOf(i));
        keyButtons[10] = new JButton("/");
        keyButtons[11] = new JButton("*");
        keyButtons[12] = new JButton("-");
        keyButtons[13] = new JButton("+");
        keyButtons[14] = new JButton("=");
        keyButtons[15] = new JButton(".");
        for(JButton button: keyButtons){
            button.setFont(new Font("Arial", Font.BOLD, 14));
            keysPanel.add(button);
        }
        setLayout(new BorderLayout());
        textFieldLCD = new JTextField("LCD");
        textFieldLCD.setFont(new Font("Serif", Font.BOLD, 18));
        textFieldLCD.setForeground(Color.red);
        add(textFieldLCD, BorderLayout.NORTH);
        add(keysPanel, BorderLayout.CENTER);
        
    }
    
}
