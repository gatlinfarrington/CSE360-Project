package Screens;

import java.util.ArrayList;

import Users.User;
import Users.Msg;
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
		
		Msg m = new Msg(curUser);
		
		//generic home screen, should never be used outside of testing
		
		//need to list patient contact info somewhere
				Label l = new Label();
				l.setText("Messages");
				l.setPrefSize(1000,300);
				l.setMinSize(300, 50);
				l.setAlignment(Pos.CENTER);
				
				//textField
				Label msgs = new Label("messages will appear here");
                TextField tf = new TextField("enter message");
                
                messagesToDisplay = m.readMsg(curUser);
        	    String msgString = "";
        	    for(int i = 0; i < messagesToDisplay.size();i++) {
        	    	msgString += "\n" + messagesToDisplay.get(i);
        	    	msgs.setText(msgString);
        	    }
                
                
                //TODO set location of tf
                tf.setAlignment(Pos.CENTER);
                msgs.setAlignment(Pos.CENTER);
                //TODO Display Messages

			
				Button send = new Button();
				send.setText("Send");
				send.setOnAction(e -> {
				    
				    
				    
				    //patient is owner Curernt user could be the patient or doctor or nurse
				    m.addMsg(curUser, tf.getText());
				    messagesToDisplay = m.readMsg(curUser);
				    String msgString2 = "";
				    for(int i = 0; i < messagesToDisplay.size();i++) {
				    	msgString2 += "\n" + messagesToDisplay.get(i);
				    	msgs.setText(msgString2);
				    }
				    
				});
				
				
				Button home = new Button();
				home.setText("Back home");
				home.setOnAction(e -> {
					HomeScreen hs = new HomeScreen(primaryStage, curUser);
					primaryStage.setScene(hs.getScene());
				});
				
				
				VBox layout1 = new VBox();     
				layout1.getChildren().addAll(l,msgs, send, home, tf);
				layout1.snapPositionX(500);
				messageScene = new Scene(layout1, 1000, 1000);
	}
	
	public Scene getScene() {
		return messageScene;
	}
}
