/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aashgar
 */
public class LoginFrame extends JFrame{
    private JLabel labelName, labelPassword;
    private JPasswordField textFieldPassword;
    private JTextField textFieldName;
    private JButton buttonOK, buttonCancel;
    private JPanel panelLogin;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public LoginFrame(String title) {
        super(title);
        panelLogin = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelLogin.setPreferredSize(new Dimension(440,150));
        panelLogin.setBorder(BorderFactory.createTitledBorder("Login Panel"));
        labelName = new JLabel("Login Name: ");
        panelLogin.add(labelName);
        textFieldName = new JTextField("", 30);
        panelLogin.add(textFieldName);
        labelPassword = new JLabel("Password:    ");
        panelLogin.add(labelPassword);
        textFieldPassword = new JPasswordField(30);
        panelLogin.add(textFieldPassword);
        buttonOK=new JButton("OK");
        buttonCancel=new JButton("CANCEL");
        panelLogin.add(buttonOK);
        panelLogin.add(buttonCancel);        
        textArea = new JTextArea();
        textArea.setText("Text Area Text Area \n" +
                "Text Area Text Area \n"+
                "Text Area Text Area \n"+
                "Text Area Text Area \n"+
                "Text Area Text Area \n"+
                "Text Area Text Area \n"+
                "Text Area Text Area \n"); 
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(panelLogin);
        add(scrollPane);
        
        
    }
    
    
}
