package fxtest.fxml;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;


public class DemoMain extends Application {
	
	@Override
	public void start(Stage pStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/FxmlController.fxml"));
			pStage.setTitle("FXML Demo");
			pStage.setScene(new Scene(root, 500, 300));
			pStage.show();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
