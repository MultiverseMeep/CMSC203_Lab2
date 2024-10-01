package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		
		
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 500, 500));
		
		
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
