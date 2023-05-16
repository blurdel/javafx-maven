package fxtest;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloFX extends Application {

	@Override
	public void start(Stage pStage) throws IOException {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		
		Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion);
		Scene scene = new Scene(new StackPane(label), 640, 480);
		pStage.setScene(scene);
		pStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
