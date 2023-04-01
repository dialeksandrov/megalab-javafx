package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static ObservableList<User> users;

    @FXML
    private Button addBtn;

    @FXML
    private Button cnlBtn;

    @FXML
    private Button delBtn;

    @FXML
    private TableView<User> usersTable;

    @FXML
    public void init(){

    }

    @FXML
    public void onAdd(){
        addBtn.setOnMouseClicked((event) -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_user.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    public void onCancel(){
        cnlBtn.isCancelButton();
        Stage stage = (Stage) cnlBtn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        users = FXCollections.observableArrayList(new ArrayList<>());
        users.add(new User("login", "Test", "email"));
        var loginColumn = new TableColumn<User, String>("Login");
        loginColumn.setCellValueFactory(new PropertyValueFactory<>("login"));

        var fullNameColumn = new TableColumn<User, String>("FullName");
        fullNameColumn.setCellValueFactory(new PropertyValueFactory<>("fullName"));

        var emailColumn = new TableColumn<User, String>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        usersTable.getColumns().setAll(loginColumn,
                fullNameColumn, emailColumn);
        usersTable.setItems(users);
    }

    @FXML
    public void onDeleteUser(){

    }

    public void addUserToList(User user){
        users.add(user);
        usersTable.refresh();
    }
}
