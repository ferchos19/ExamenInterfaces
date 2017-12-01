package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
private Stage stage;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			stage = primaryStage;
			startWindow();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void startWindow() throws IOException {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Ventana.fxml"));
		
		AnchorPane root = loader.load();
		Scene scene = new Scene(root);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.setScene(scene);
		stage.show();
		
	

	}
	public static void main(String[] args) {
		launch(args);
	}
	
}