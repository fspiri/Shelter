package org.shelter.controllers;

import javafx.fxml.FXML;

import java.io.IOException;

public class SetupController {


    @FXML
    public void goBack() throws IOException {
        org.shelter.App.setRoot("primary");
    }
}
