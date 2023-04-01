package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static sample.Controller.users;

public class AddUser {

   // private final Controller controller;



    @FXML
    private Button cancelBtn;

    @FXML
    private TextField emailField;

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField loginField;

    @FXML
    private Button saveBtn;


    @FXML
    public void close(){
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void addUser(){
        User user = new User();
        user.setLogin(loginField.getText());
        user.setFullName(fullNameField.getText());
        user.setEmail(emailField.getText());
        users.add(user);
        close();
    }
}
