package Screens;

import java.util.ArrayList;

import Users.User;
import Users.UserTracker;
import Users.Msg;
import Users.Patient;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Messages {
	Scene messageScene;
	
	//stores current messages to display on screen
	public static ArrayList<String> messagesToDisplay = new ArrayList<String>();
	
	//needs a curUser
	public Messages(Stage primaryStage, User curUser) {
		Msg m = null;
		if(curUser.isPat() == true) {
				m = new Msg(curUser);
			
			
			
			//generic home screen, should never be used outside of testing
			
			//need to list patient contact info somewhere
					Label l = new Label();
					l.setText("Messages");
					l.setMinSize(300, 50);
					l.setAlignment(Pos.CENTER);
					
					//textField
					TextArea msgs = new TextArea("messages will appear here");
	                TextField tf = new TextField("enter message");
	                
	                messagesToDisplay = m.readMsg(curUser);
	        	    String msgString = "";
	        	    for(int i = 0; i < messagesToDisplay.size();i++) {
	        	    	msgString += "\n" + messagesToDisplay.get(i);
	        	    	msgs.setText(msgString);
	        	    }
	                
	                
	                //TODO set location of tf
	                tf.setAlignment(Pos.CENTER);
	                msgs.setEditable(false);
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
					    msgs.setScrollTop(msgs.getHeight()*2);
					    
					});
					
					
					Button home = new Button();
					home.setText("Back home");
					home.setOnAction(e -> {
						HomeScreen hs = new HomeScreen(primaryStage, curUser);
						primaryStage.setScene(hs.getScene());
					});
					
					
					VBox layout1 = new VBox();     
					HBox messagelayer = new HBox();
					messagelayer.getChildren().addAll(tf,send);
					layout1.getChildren().addAll(l,msgs, home, messagelayer);
					layout1.snapPositionX(500);
					messageScene = new Scene(layout1, 500, 500);
		}else {
			Label l = new Label();
			l.setText("Messages");
			l.setMinSize(300, 50);
			l.setAlignment(Pos.CENTER);
			
			TextField name = new TextField();
			name.setText("name");
			name.setAlignment(Pos.CENTER);
			
			TextField pw = new TextField();
			pw.setText("Password");
			pw.setAlignment(Pos.CENTER);
			
			//textField
			TextArea msgs = new TextArea("messages will appear here");
            TextField tf = new TextField("enter message");
            
            
            
            UserTracker ut = new UserTracker();
            
            
            Button ent = new Button();
			ent.setText("Enter Patient");
			ent.setOnAction(e -> {
				Patient curPatient = UserTracker.getPatient(ut.getPatientList(), name.getText(), pw.getText());
				Msg pm = new Msg(curPatient);
				
				
				
				//generic home screen, should never be used outside of testing
				
				//need to list patient contact info somewhere

		                
		                messagesToDisplay = pm.readMsg(curPatient);
		        	    String msgString = "";
		        	    for(int i = 0; i < messagesToDisplay.size();i++) {
		        	    	msgString += "\n" + messagesToDisplay.get(i);
		        	    	msgs.setText(msgString);
		        	    }
		                
		                
		               
				
						});
			
			Button send = new Button();
			send.setText("Send");
			send.setOnAction(e -> {
			    
			    
			    
			    //patient is owner Curernt user could be the patient or doctor or nurse
			    m.addMsg(UserTracker.getPatient(ut.getPatientList(), name.getText(), pw.getText()), tf.getText());
			    messagesToDisplay = m.readMsg(UserTracker.getPatient(ut.getPatientList(), name.getText(), pw.getText()));
			    String msgString2 = "";
			    for(int i = 0; i < messagesToDisplay.size();i++) {
			    	msgString2 += "\n" + messagesToDisplay.get(i);
			    	msgs.setText(msgString2);
			    }
			    msgs.setScrollTop(msgs.getHeight()*2);
			    
			});
			
			Button home = new Button();
			home.setText("Back home");
			home.setOnAction(e -> {
				HomeScreen hs = new HomeScreen(primaryStage, curUser);
				primaryStage.setScene(hs.getScene());
			});
			
			VBox layout2 = new VBox();     
			HBox messagelayer = new HBox();
			messagelayer.getChildren().addAll(name,pw,tf,send);
			layout2.getChildren().addAll(l,msgs, ent, messagelayer, home);
			layout2.snapPositionX(500);
			messageScene = new Scene(layout2, 500, 500);
            
            
		}
	}
	
	public Scene getScene() {
		return messageScene;
	}
}
