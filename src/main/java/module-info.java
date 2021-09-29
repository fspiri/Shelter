module org.shelter {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens org.shelter to javafx.fxml;
    exports org.shelter;
    exports org.shelter.controllers;
    opens org.shelter.controllers to javafx.fxml;
}
