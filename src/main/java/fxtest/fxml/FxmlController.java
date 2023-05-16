package fxtest.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FxmlController implements Initializable {

	@FXML
	private Label lblVersion;
	
	@FXML
	private Button btnSubmit;
	
	@FXML
	private TextField txtName;
	
	private Person person;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			
			String javaVersion = System.getProperty("java.version");
			String javafxVersion = System.getProperty("javafx.version");
			lblVersion = new Label("JavaFX " + javafxVersion + " on " + javaVersion);
			
			person = FXMLLoader.load(getClass().getResource("/fxml/Person.fxml"));
			txtName.setText(person.getFullName());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void btnSubmitHandler(ActionEvent event) {
		if (txtName.getText().startsWith("JavaFX")) {
			txtName.setText(person.getFullName());
		}
		else {
			txtName.setText(lblVersion.getText());
		}
	}
	
}
