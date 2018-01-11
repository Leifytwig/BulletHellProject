package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			root.setTop(new TextField("Top")); 
		    root.setBottom(new TextField("Bottom")); 
		    root.setLeft(new TextField("Left")); 
		    root.setRight(new TextField("Right")); 
		    root.setCenter(new TextField("Center")); 
			
			Scene scene = new Scene(root, 1024, 576);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.DARKCYAN);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("BulletHellProject");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
