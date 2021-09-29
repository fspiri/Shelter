package org.shelter.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.shelter.App;

public class PrimaryController {
    Object date = new Date(DateFormat.SHORT);
    @FXML Text dateText = new Text();
    @FXML Button setupButton = new Button();
    @FXML Button addAccountButton = new Button();
    @FXML TextField addAccountTextField= new TextField();
    @FXML Button cancButton = new Button();

    @FXML
    public void initialize(){
        addAccountTextField.setVisible(false);
        cancButton.setVisible(false);
        dateText.setText(date.toString());
    }
    @FXML
    private void setUp() throws IOException {
        org.shelter.App.setRoot("setup");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        org.shelter.App.setRoot("secondary");
    }

    @FXML
    private void addAccountButtonHandler(){
        addAccountTextField.setVisible(true);
        cancButton.setVisible(true);
    }

    @FXML
    private void addAccountTextFieldHandler(){
        hide();
        org.shelter.ioManager.FileLogic.add(addAccountTextField.getText());
    }

    @FXML
    private void hide(){
        addAccountTextField.setText("");
        addAccountTextField.setVisible(false);
        cancButton.setVisible(false);
    }

}
