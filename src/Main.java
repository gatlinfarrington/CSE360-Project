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

//INITIAL PROTOTYPE SUBMISSION
//this is testing the ability to store user information and login in to a user.
//The ability to create a user is also present here
public class Main extends Application{

	public static void main(String[] args) throws IOException {
		//create and Initialize Patient List
//		ArrayList<Patient> patientList = new ArrayList<Patient>();
//		initPatientList(patientList);
		launch(args);
		//welcome and create Scanners
//		System.out.println("Welcome to Mentcare!");
//		Scanner scan = new Scanner(System.in);
//		Scanner choiceScan = new Scanner(System.in);
//		Patient CurUser;
//		
		
		
		
		
		
		/*
		//choices
		System.out.println("Would you like to: \n1. Sign up a new user \n2.Sign into a user?");
		int choice = choiceScan.nextInt();
		System.out.println(patientList.get(0).Name);
		
		//choice 1, add user
		if(choice == 1) {
			System.out.println("Please enter your 'name,password,age,address,phone,email.'");
			scan.hasNext();
			String input = scan.nextLine();
			String[] inputArr = input.split(",");
			
			
			//if user does not exist, sign them up, if they do deny.
			if(!userExists(patientList, inputArr[0],inputArr[1])) {
				signup(inputArr[0], inputArr[1], Integer.parseInt(inputArr[2]), inputArr[3], inputArr[4], inputArr[5]);
			}else {
				System.out.println("A user with that userName and Password already Exists");
			}
			
		}else if(choice == 2) { //Choice 2, log into a user
			
			System.out.println("Please enter your 'name,password'");
			scan.hasNext();
			String loginInput = scan.nextLine();
			String[] inputArr = loginInput.split(",");
			if(userExists(patientList, inputArr[0], inputArr[1])) {
				CurUser = new Patient(getPatient(patientList, inputArr[0], inputArr[1]));
				System.out.println("User: " + CurUser.Name + " has been logged in.\nWelcome in.");
			}else {
				System.out.println("User does not exist or information was not correct.");
			}
			
		}else {//else
			System.out.println("Not a valid choice.");
		}
		
		*/
		
	}
	
		
//	public static void signup(String name, String pass, int age, String address, String phone, String email) {
//		File PatientFile = new File("PatientFile.txt");
//		try {
//			FileWriter fw = new FileWriter(PatientFile, true); //true means it will append at the bottom.
//			fw.write(name + ","+ pass + "," + age + "," + address + "," + phone + "," + email + "\n");
//			
//			
//			fw.close();
//			System.out.println("User added.");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public static void initPatientList(ArrayList<Patient> List) {
//		try {
//			//will use a bufferedReader to read the text doc that stores info
//			BufferedReader br = new BufferedReader(new FileReader("PatientFile.txt"));
//			String line = br.readLine();
//			String[] UserArr = new String[6];
//			while(line != null) {
//				UserArr = line.split(",");
//				//add new patient to the list
//				List.add(new Patient(UserArr[0], UserArr[1], Integer.parseInt(UserArr[2]), UserArr[3], UserArr[4], UserArr[5]));
//				line = br.readLine();
//			}
//			br.close();
//			System.out.println("Pateint list has been initialized.");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public static boolean userExists(ArrayList<Patient> List, String name, String password) {
//		for(int i = 0; i < List.size(); i++) {
//			if(name.equals(List.get(i).Name) ) {
//				
//				if(password.equals(List.get(i).Password)) {
//					//nested if statements to require both be true.
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}
//	
//	public static Patient getPatient(ArrayList<Patient> List, String name, String password) {
//		for(int i = 0; i < List.size(); i++) {
//			if(name.equals(List.get(i).Name) ) {
//				
//				if(password.equals(List.get(i).Password)) {
//					return List.get(i);
//				}
//			}
//		}
//		return null;
//	}
	
	
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
