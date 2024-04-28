package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private TextField txtUsername;
	@FXML
	private PasswordField txtPassword;

	public void login(ActionEvent e) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Form2.fxml"));
		root = loader.load();
		scene = new Scene(root);
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		if (txtUsername.getText().equals("Admin") && txtPassword.getText().equals("123")) {
			WelcomeController w = loader.getController();
			w.show(txtUsername.getText());
			stage.setScene(scene);
			stage.show();
		} else {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Error");
			alert.setHeaderText("Error");
			alert.setContentText("Error, wrong information.");
			alert.showAndWait();
		}
	}
}
