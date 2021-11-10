package Screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Messages {
	Scene messageScene;
	public Messages(Stage primaryStage) {
		//generic home screen, should never be used outside of testing
				Label l = new Label();
				l.setText("Messages");
				l.setPrefSize(1000,300);
				l.setMinSize(300, 50);
				l.setAlignment(Pos.CENTER);
				
				
				Button send = new Button();
				send.setText("Send");
				send.setOnAction(e -> {
					//send message
				});
				
				
				Button home = new Button();
				home.setText("Back home");
				home.setOnAction(e -> {
					HomeScreen hs = new HomeScreen(primaryStage);
					primaryStage.setScene(hs.getScene());
				});
				
				
				VBox layout1 = new VBox();     
				layout1.getChildren().addAll(l, send, home);
				layout1.snapPositionX(500);
				messageScene = new Scene(layout1, 1000, 1000);
	}
	
	public Scene getScene() {
		return messageScene;
	}
}
