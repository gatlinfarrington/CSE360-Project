package Screens;

import Users.Patient;
import Users.Doctor;
import Users.Nurse;
import Users.User;
import Users.UserTracker;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class createAccount {
	Scene login;
	public createAccount(Stage primaryStage) {
		Label l = new Label();
		l.setText("Create Account");
		l.setPrefSize(1000,300);
		l.setMinSize(300, 50);
		l.setAlignment(Pos.CENTER);
		
		TextField name = new TextField();
		name.setText("name");
		name.setAlignment(Pos.CENTER);
		
		TextField pw = new TextField();
		pw.setText("Password");
		pw.setAlignment(Pos.CENTER);
		
		TextField age = new TextField();
		age.setText("age");
		age.setAlignment(Pos.CENTER);
		
		TextField address = new TextField();
		address.setText("Address");
		address.setAlignment(Pos.CENTER);
		
		TextField phone = new TextField();
		phone.setText("Phone");
		phone.setAlignment(Pos.CENTER);
		
		TextField email = new TextField();
		email.setText("email");
		email.setAlignment(Pos.CENTER);
		
		ComboBox<String> type = new ComboBox<String>();
		type.getItems().addAll(
				"Doctor",
				"Patient",
				"Nurse"
		);
		type.setPromptText("Select Account Type");
		
		Button create = new Button();
		create.setText("Create.");
		create.setAlignment(Pos.CENTER);
		create.setOnAction(e -> {
			User curUser = null;
			if(type.getValue().equals("Nurse")) {
				UserTracker.signupNur(name.getText(), pw.getText(), Integer.parseInt(age.getText()),address.getText(), phone.getText(), email.getText());
				curUser = new Nurse(name.getText(), pw.getText(), Integer.parseInt(age.getText()));
				HomeScreen patientHome = new HomeScreen(primaryStage, curUser);
				primaryStage.setScene(patientHome.getScene());
				
			}else if(type.getValue().equals("Doctor")) {
				UserTracker.signupDr(name.getText(), pw.getText(), Integer.parseInt(age.getText()),address.getText(), phone.getText(), email.getText());
				curUser = new Doctor(name.getText(), pw.getText(), Integer.parseInt(age.getText()));
				HomeScreen patientHome = new HomeScreen(primaryStage, curUser);
				primaryStage.setScene(patientHome.getScene());
				
			}else if(type.getValue().equals("Patient")) { //Pateint is selected, create a new Patient and add them to the file that keeps track of them, sign in patient
				UserTracker.signupPatient(name.getText(), pw.getText(), Integer.parseInt(age.getText()),address.getText(), phone.getText(), email.getText());
				curUser = new Nurse(name.getText(), pw.getText(), Integer.parseInt(age.getText()));
				HomeScreen patientHome = new HomeScreen(primaryStage, curUser);
				primaryStage.setScene(patientHome.getScene());
			}
			HomeScreen hs = new HomeScreen(primaryStage,curUser);
			primaryStage.setScene(hs.getScene());
		});
		
		
		//VBOX is what would change to change orientation
		VBox layout1 = new VBox();     
		layout1.getChildren().addAll(l, name, pw, age, address, phone, email, type, create);
		layout1.snapPositionX(500);
		login = new Scene(layout1, 500, 500);
		
		
		
	}
	public Scene getScene() {
		return login;
	}
}
