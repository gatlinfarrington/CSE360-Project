package Screens;
//package Msg;

import java.util.ArrayList;

import Users.User;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Messages {
	Scene messageScene;
	
	//stores current messages to display on screen
	public static ArrayList<String> messagesToDisplay = new ArrayList<String>();
	
	//needs a curUser
	public Messages(Stage primaryStage, User curUser) {
		//generic home screen, should never be used outside of testing
		
		//need to list patient contact info somewhere
				Label l = new Label();
				l.setText("Messages");
				l.setPrefSize(1000,300);
				l.setMinSize(300, 50);
				l.setAlignment(Pos.CENTER);
				
				//textField
                TextField tf = new TextField("enter message");
                //TODO set location of tf
                
                //TODO Display Messages

			
				Button send = new Button();
				send.setText("Send");
				send.setOnAction(e -> {
				    
				    /*
				    Msg m = new Msg(patient);
				    //patient is owner Curernt user could be the patient or doctor or nurse
				    m.addMsg(currentUser, tf.getText());
				    messagesToDisplay = m.readMsg();
				    UpdateMsgScreen(); // updates message screen with new message
				    */	
				});
				
				
				Button home = new Button();
				home.setText("Back home");
				home.setOnAction(e -> {
					HomeScreen hs = new HomeScreen(primaryStage, curUser);
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
