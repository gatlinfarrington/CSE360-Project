package Screens;

import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Login{
	
	 Scene myScene, scene1;
	
	public Login(Stage primaryStage) throws Exception {
		Label l = new Label();
		l.setText("Welcome to MentCare");
		l.setPrefSize(1000,300);
		l.setMinSize(300, 50);
		l.setAlignment(Pos.TOP_CENTER);
		TextField name = new TextField();
		name.setText("name");
		TextField pw = new TextField();
		pw.setText("Password");
		Button login = new Button();
		login.setText("Login");
		login.setOnAction(e -> System.out.println("Login Press"));
		Button createNew = new Button("Create new Account");
		createNew.setOnAction(e -> {
			primaryStage.setScene(null);
		});
//		StackPane root = new StackPane();
//		root.getChildren().addAll(l, name, pw, login);
		
		
		VBox layout1 = new VBox();     
		layout1.getChildren().addAll(l, name, pw, login, createNew);
		layout1.snapPositionX(500);
		scene1= new Scene(layout1, 1000, 1000);
		
		
	}
	
	public Scene getLoginScene() {
		return scene1;
	}

}
