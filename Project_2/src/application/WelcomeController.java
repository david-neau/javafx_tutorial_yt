package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WelcomeController {
@FXML
private Label lblName;
@FXML
private Stage stage;
private Scene scene;
private Parent root;

public void show(String name) {
	lblName.setText("Welcome, " + name);
}

@FXML
void logout(ActionEvent e) throws IOException{
	root = FXMLLoader.load(getClass().getResource("/application/Form1.fxml"));
	scene = new Scene(root);
	stage = (Stage) lblName.getScene().getWindow();
	stage.setScene(scene);
	stage.show();
}
}
