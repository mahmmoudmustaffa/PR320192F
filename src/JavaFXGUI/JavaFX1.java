/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXGUI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class JavaFX1 extends Application{
    private ListView listViewNames;
    private TextField textFieldName;
    private Button buttonUpdate;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        //flowPane.setMaxSize(200, 150);
        listViewNames = new ListView();
        listViewNames.setMaxSize(200, 150);
        listViewNames.setItems(FXCollections.
                observableArrayList("Ahmad","Ali","Huda"));
        EventHandler eventHandler = new EventHandler();
        listViewNames.addEventHandler(MouseEvent.MOUSE_CLICKED,
                eventHandler);
        textFieldName = new TextField("Initial Text");
        buttonUpdate = new Button("Update");        
        buttonUpdate.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        flowPane.getChildren().addAll(listViewNames,
                textFieldName,buttonUpdate);
        Scene scene = new Scene(flowPane,200,200);
        primaryStage.setScene(scene);       
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    private class EventHandler implements  
            javafx.event.EventHandler<Event>{

        @Override
        public void handle(Event event) {
            if(event.getSource() == listViewNames)
                textFieldName.setText(
                        (String)listViewNames.getSelectionModel()
                                .getSelectedItem());
        }
        
    }
}
