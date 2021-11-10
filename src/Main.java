/*		GROUP 28
 * Gatlin Farrington, Vishok Jayaraman, Pramith Chivanna, Haydn Van Norman, Jane Seangatith
 * 
 */

import java.io.IOException;
import java.util.Scanner;
//import other packages
import Users.*;
import Screens.*;

//import java.io
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

//import java.util
import java.util.ArrayList;

import javafx.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) throws IOException {
		//launch the scene
		launch(args);
	
		
	}
	
		
	
	
//	TEST CODE TO SEE IF FX IS WORKING IN MY PROJECT
	@Override
    public void start(Stage primaryStage) throws Exception {
		
        primaryStage.setTitle("MentCare");
        Button btn = new Button();
       
        btn.setText("Launch MentCare");
        Login l = new Login(primaryStage);
        Scene loginScene = l.getScene();
        btn.setOnAction(e -> primaryStage.setScene(loginScene));

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
	

}
