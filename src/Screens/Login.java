package Screens;

import Users.*;
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
	 User curUser = null;
	public Login(Stage primaryStage) throws Exception {
		//backend Setup
		UserTracker ut = new UserTracker();
		
		
		//scene setup
		Label l = new Label();
		l.setText("Welcome to MentCare");
		l.setPrefSize(1000,300);
		l.setMinSize(300, 50);
		l.setAlignment(Pos.CENTER);
		
		TextField name = new TextField();
		name.setText("name");
		name.setAlignment(Pos.CENTER);
		
		TextField pw = new TextField();
		pw.setText("Password");
		pw.setAlignment(Pos.CENTER);
		
		Button login = new Button();
		
		ComboBox<String> select = new ComboBox();
		select.getItems().addAll("Patient", "Doctor", "Nurse");
		select.setPromptText("Account Type:");
		
		login.setText("Login");
		login.setAlignment(Pos.CENTER);
		login.setOnAction(e -> {
			if(select.getValue().equals("Patient")) { //Patient signin is selected
				ut.initPatientList();
				// if the user exists, move to homescreen, set the currentUser
				if(UserTracker.userExists(ut.getPatientList(), name.getText(), pw.getText())) {
					System.out.println("User Exists!");
					Patient curPatient = UserTracker.getPatient(ut.getPatientList(), name.getText(), pw.getText());
					HomeScreen hs = new HomeScreen(primaryStage, curPatient);
					primaryStage.setScene(hs.getScene());
					
				}else {
					name.clear();
					pw.clear();
					name.setText("name");
					pw.setText("Password");
					l.setText("INCORRECT USERNAME OR PASSWORD");
				}
			}
			else if(select.getValue().equals("Nurse")) {//if Logging into a Nurse, will be same as patient but Swapped out for signing into a nurse
				ut.initNurseList();
				if(UserTracker.userExistsN(ut.getNurList(), name.getText(), pw.getText())) {
					System.out.println("User Exists!");
					Nurse curNur = UserTracker.getNur(ut.getNurList(), name.getText(), pw.getText());
					HomeScreen hs = new HomeScreen(primaryStage, curNur);
					primaryStage.setScene(hs.getScene());
					
				}else {
					name.clear();
					pw.clear();
					name.setText("name");
					pw.setText("Password");
					l.setText("INCORRECT USERNAME OR PASSWORD");
				}
			}
			else if(select.getValue().equals("Doctor")) {//if Logging into a Doctor, will be same as patient but Swapped out for signing into a Doc
				ut.initDoctorList();
				if(UserTracker.userExistsD(ut.getDrList(), name.getText(), pw.getText())) {
					System.out.println("User Exists!");
					Doctor curDoc = UserTracker.getDr(ut.getDrList(), name.getText(), pw.getText());
					HomeScreen hs = new HomeScreen(primaryStage, curDoc);
					primaryStage.setScene(hs.getScene());
					
				}else {
					name.clear();
					pw.clear();
					name.setText("name");
					pw.setText("Password");
					l.setText("INCORRECT USERNAME OR PASSWORD");
				}
			}else {//if none of the above
				//if it doesnt display incorrect info, clear the text boxes.
				name.clear();
				pw.clear();
				name.setText("name");
				pw.setText("Password");
				l.setText("INCORRECT USERNAME OR PASSWORD");
				
			}
			
			
		});
		
		Button createNew = new Button("Create new Account");
		createNew.setAlignment(Pos.CENTER);
		createNew.setOnAction(e -> {
			createAccount c = new createAccount(primaryStage);
			primaryStage.setScene(c.getScene());
		});
		
		
		VBox layout1 = new VBox(); 
		HBox navBar = new HBox();
		navBar.getChildren().addAll(login, createNew, select);
		navBar.setAlignment(Pos.CENTER);
		layout1.getChildren().addAll(l, name, pw, navBar);
		layout1.snapPositionX(500);
		scene1= new Scene(layout1, 500, 500);
		
		
	}
	
	public Scene getScene() {
		return scene1;
	}

}
