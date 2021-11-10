package Screens;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		Button create = new Button();
		create.setText("Create.");
		create.setAlignment(Pos.CENTER);
		create.setOnAction(e -> {
			HomeScreen hs = new HomeScreen(primaryStage);
			primaryStage.setScene(hs.getScene());
		});
		
		//VBOX is what would change to change orientation
		VBox layout1 = new VBox();     
		layout1.getChildren().addAll(l, name, pw, age, address, phone, email, create);
		layout1.snapPositionX(500);
		login = new Scene(layout1, 1000, 1000);
		
		
		
	}
	public Scene getScene() {
		return login;
	}
}
