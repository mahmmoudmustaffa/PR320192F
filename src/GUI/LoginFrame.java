/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private JTextField textFieldData;
    private JCheckBox checkBoxBold, checkBoxItalic;

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
        EventHandler eventHandler = new EventHandler();
        buttonOK.addActionListener(eventHandler);
        buttonCancel=new JButton("CANCEL");        
        panelLogin.add(buttonOK);
        panelLogin.add(buttonCancel); 
        buttonCancel.addActionListener(eventHandler);
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
        textFieldData = new JTextField("Data", 40);
        checkBoxBold = new JCheckBox("Bold");
        checkBoxItalic = new JCheckBox("Italic");
        EventHandler2 eventHandler2 = new EventHandler2();
        checkBoxBold.addItemListener(eventHandler2);
        checkBoxItalic.addItemListener(eventHandler2);
        add(textFieldData);
        add(checkBoxBold); add(checkBoxItalic);
    }
    private class EventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buttonOK)
            JOptionPane.showMessageDialog(null, 
                    textFieldName.getText()+"\n" +
                    String.valueOf(textFieldPassword.getPassword()));
            else if(e.getSource() == buttonCancel)
                System.exit(0);
        }
        
    }
    private class EventHandler2 implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == checkBoxBold)
                textFieldData.setFont(
                        new Font("Arial", Font.BOLD, 18));
            else if(e.getSource() == checkBoxItalic)
                textFieldData.setFont(
                        new Font("Arial", Font.ITALIC, 18));
            else
                textFieldData.setFont(
                        new Font("Arial", Font.PLAIN, 12));
        }
        
    }
    
    
}
