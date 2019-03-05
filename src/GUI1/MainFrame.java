/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import java.awt.HeadlessException;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author aashgar
 */
public class MainFrame extends JFrame{
    private CalcPanel calcPanel;
    private JTabbedPane tabbedPane;
    private JTextField textField;
    public MainFrame(String title) throws HeadlessException {
        super(title);
        tabbedPane = new JTabbedPane();
        calcPanel = new CalcPanel(); 
        tabbedPane.addTab("Calc", null, calcPanel, "Calculator");
        textField = new JTextField("Programming is very funny!!!");
        tabbedPane.addTab("New tab", null, textField, "????");
        add(tabbedPane);
    }
    
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame("Main Windows");
        mainFrame.setSize(300, 300);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
    }
    
}
