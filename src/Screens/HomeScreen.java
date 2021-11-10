package Screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import Users.*;

public class HomeScreen {
	Scene home;
	//default
	public HomeScreen(Stage primaryStage) {
		//generic home screen, should never be used outside of testing
		Label l = new Label();
		l.setText("Welcome to the HomePage");
		l.setPrefSize(1000,300);
		l.setMinSize(300, 50);
		l.setAlignment(Pos.CENTER);
		
		
		Button signout = new Button();
		signout.setText("Sign out");
		signout.setOnAction(e -> {
			try {
				Login log = new Login(primaryStage);
				primaryStage.setScene(log.getScene());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
		
		Button messages = new Button();
		messages.setText("Messages");
		messages.setOnAction(e -> {
			Messages m = new Messages(primaryStage);
			primaryStage.setScene(m.getScene());
		});
		
		
		VBox layout1 = new VBox();     
		layout1.getChildren().addAll(l, signout, messages);
		layout1.snapPositionX(500);
		home = new Scene(layout1, 1000, 1000);
	}
	
	
	//curUser Required
	public HomeScreen(Stage primaryStage, User curUser) {
		//generic home screen, should never be used outside of testing
		VBox layout1 = new VBox(); 
		Label l = new Label();
		l.setText("Welcome to the HomePage");
		l.setPrefSize(1000,300);
		l.setMinSize(300, 50);
		l.setAlignment(Pos.CENTER);
		Label userName = new Label();
		if(curUser instanceof Doctor) {
			//implement doctor home screen
		}else if(curUser instanceof Nurse) {
			//implement nurse homes creen
		}else if(curUser instanceof Patient) {
			//implement Patient home screen
			
			System.out.println("Hello " + curUser.getName());
			userName.setPrefSize(1000,300);
			userName.setMinSize(300, 50);
			System.out.println("User is a patient");
		}
		
		Button signout = new Button();
		signout.setText("Sign out");
		signout.setOnAction(e -> {
			try {
				Login log = new Login(primaryStage);
				primaryStage.setScene(log.getScene());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
		
		Button messages = new Button();
		messages.setText("Messages");
		messages.setOnAction(e -> {
			Messages m = new Messages(primaryStage);
			primaryStage.setScene(m.getScene());
		});
		
		
		    
		layout1.getChildren().addAll(l, userName, signout, messages);
		layout1.snapPositionX(500);
		home = new Scene(layout1, 1000, 1000);
	}
	
//	//will implement when curUser is implemented throughout.
//	public HomeScreen(Stage primaryStage, User curUser) {
//		if(curUser instanceof Doctor) {
//			//implement doctor home screen
//		}else if(curUser instanceof Nurse) {
//			//implement nurse homes creen
//		}else if(curUser instanceof Patient) {
//			//implement Patient home screen
//		}
//	}
	
	public Scene getScene() {
		return home;
	}
}
