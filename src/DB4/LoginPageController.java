/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aashgar
 */
public class LoginPageController implements Initializable {
    @FXML
    private TextField textFieldLoginName;
    @FXML
    private PasswordField textFieldPassword;
    @FXML
    private Button buttonOK;
    @FXML
    private Button buttonExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonOK(ActionEvent event) {
    }

    @FXML
    private void handleButtonExit(ActionEvent event) {
    }
    
}
