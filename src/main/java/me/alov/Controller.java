package me.alov;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    TextField firstNameTextField;

    @FXML
    TextField lastNameTextField;

    @FXML
    TextField middleNameTextField;

    @FXML
    Button saveButton;

    @FXML
    Label label;


    @FXML
    void callWhenButtonClicked() {
        label.setText(firstNameTextField.getText() + " " + lastNameTextField.getText() + " " + middleNameTextField.getText());

    }
}
