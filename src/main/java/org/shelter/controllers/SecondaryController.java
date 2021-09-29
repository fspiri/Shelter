package org.shelter.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import org.shelter.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        org.shelter.App.setRoot("primary");
    }
}