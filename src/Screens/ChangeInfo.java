package Screens;

import Users.Doctor;
import Users.Nurse;
import Users.Patient;
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

public class ChangeInfo {
	Scene changeInfo;
	public ChangeInfo(Stage primaryStage, User curUser) {
		//patient instance
		if(curUser instanceof Patient) {
			Label l = new Label();
			l.setText("Change Info");
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
			
	
			
			Button change = new Button();
			change.setText("Change.");
			change.setAlignment(Pos.CENTER);
			change.setOnAction(e -> {
				curUser.setName(name.getText());
				curUser.setPassword(pw.getText());
				curUser.setBirthday(Integer.parseInt(age.getText()));
				((Patient) curUser).setPhone(phone.getText());
				((Patient) curUser).setEmail(email.getText());
				//change info in PatientFile.txt 
				/*
				 public void changePatientInfo() {
				 	PrintWriter p = null;
				 	try {
				 		p = new PrintWriter("PatientFile.txt");
				 		BufferedWriter bw = new BufferedWriter(p);
				 		bw.write(name.getText());
				 		bw.newLine();
				 		
				 		bw.write(pw.getText());
				 		bw.newLine();
				 		
				 		bw.write(Integer.parseInt(age.getText()));
				 		bw.newLine();
				 		
				 		bw.write(Integer.parseInt(phone.getText());
				 		bw.newLine();
				 		
				 		bw.write(email.getText());
				 	} catch (IOException e) {
				 		e.printStackTrace();
				 	}
				 }
				*/			
				HomeScreen h = new HomeScreen(primaryStage, curUser);
				primaryStage.setScene(h.getScene());
			});
			
			
			//VBOX is what would change to change orientation
			VBox layout1 = new VBox();     
			layout1.getChildren().addAll(l, name, pw, age, address, phone, email, change);
			layout1.snapPositionX(500);
			changeInfo = new Scene(layout1, 500, 500);
		}else if (curUser instanceof Doctor) {
				Label l = new Label();
				l.setText("Change Info");
				l.setPrefSize(1000,300);
				l.setMinSize(300, 50);
				l.setAlignment(Pos.CENTER);
				
				TextField name = new TextField();
				name.setText("name");
				name.setAlignment(Pos.CENTER);
				
				TextField pw = new TextField();
				pw.setText("Password");
				pw.setAlignment(Pos.CENTER);
				
				Button change = new Button();
				change.setText("Change.");
				change.setAlignment(Pos.CENTER);
				change.setOnAction(e -> {
					curUser.setName(name.getText());
					curUser.setPassword(pw.getText());

		}else if(curUser instanceof Nurse) {
				Label l = new Label();
				l.setText("Change Info");
				l.setPrefSize(1000,300);
				l.setMinSize(300, 50);
				l.setAlignment(Pos.CENTER);
				
				TextField name = new TextField();
				name.setText("name");
				name.setAlignment(Pos.CENTER);
				
				TextField pw = new TextField();
				pw.setText("Password");
				pw.setAlignment(Pos.CENTER);
				
				Button change = new Button();
				change.setText("Change.");
				change.setAlignment(Pos.CENTER);
				change.setOnAction(e -> {
					curUser.setName(name.getText());
					curUser.setPassword(pw.getText());

		}
	}
	
	public Scene getScene() {
		return changeInfo;
	}
}
