package Screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import Users.*;

public class HomeScreen {
	Scene home;
	//default
	//curUser Required
	public HomeScreen(Stage primaryStage, User curUser) {
		//generic home screen, should never be used outside of testing
		VBox layout1 = new VBox(); 
		
		//nav bar
		
		HBox navBar = new HBox();
		
		Label l = new Label();
		l.setText("Welcome to the HomePage");
		l.setAlignment(Pos.CENTER);
	
		Label userName = new Label();
		
		Label info = new Label();
		info.setText("Welcome: " + curUser.getName() + " Age: " + curUser.getBirthday());
		info.setAlignment(Pos.CENTER);
		if(curUser instanceof Doctor) {
			//implement doctor home screen
		}else if(curUser instanceof Nurse) {
			//implement nurse homes creen
		}else if(curUser instanceof Patient) {
			//implement Patient home screen
			
			System.out.println("Hello " + curUser.getName());
			//userName.setPrefSize(1000,300);
			//userName.setMinSize(300, 50);
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
			Messages m = new Messages(primaryStage, curUser);
			primaryStage.setScene(m.getScene());
		});
		
		Button changeInfo = new Button();
		changeInfo.setText("Change info");
		changeInfo.setOnAction(e ->{
			ChangeInfo c = new ChangeInfo(primaryStage, curUser);
			primaryStage.setScene(c.getScene());
		});
		
		navBar.getChildren().addAll( signout, messages, changeInfo);
		navBar.setAlignment(Pos.CENTER);
		layout1.getChildren().addAll(l, info, userName, navBar);
		layout1.setAlignment(Pos.CENTER);
		
		home = new Scene(layout1, 500, 500);
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
