package controller_Class;
// The controller package will hold Controller classes that contain Business Logic for your views.

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller_Screen {
    @FXML
    private Button ask;

    @FXML
    void Controller(MouseEvent e) {
        ask.setText("raspberry");
    }
}