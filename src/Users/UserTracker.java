package Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserTracker { //this class is used to keep track of the Lists of all users, right now only patient is implemented
	public static ArrayList<Patient> patientList = new ArrayList<Patient>();
	public static ArrayList<Doctor> DrList = new ArrayList<Doctor>();
	public static ArrayList<Nurse> NurList = new ArrayList<Nurse>();
	
	public UserTracker() {
		initPatientList();
		initDoctorList(); //STILL NEEDS IMPLEMENTATION
		initNurseList(); //STILL NEEDS IMPLEMENTATION
	}
	
	//uses a bufferedReader and the PateintFile to create an arrayList of Patients
	public static void initPatientList() {
		try {
			//will use a bufferedReader to read the text doc that stores info
			BufferedReader br = new BufferedReader(new FileReader("PatientFile.txt"));
			String line = br.readLine();
			String[] UserArr = new String[6];
			while(line != null) {
				UserArr = line.split(",");
				//add new patient to the list
				try {
					patientList.add(new Patient(UserArr[0], UserArr[1], Integer.parseInt(UserArr[2]), UserArr[3], UserArr[4], UserArr[5]));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = br.readLine();
			}
			br.close();
			System.out.println("Pateint list has been initialized.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void initDoctorList() {
		try {
			//will use a bufferedReader to read the text doc that stores info
			BufferedReader br = new BufferedReader(new FileReader("DrFile.txt"));
			String line = br.readLine();
			String[] UserArr = new String[6];
			while(line != null) {
				UserArr = line.split(",");
				//add new patient to the list
				try {
					DrList.add(new Doctor(UserArr[0], UserArr[1], Integer.parseInt(UserArr[2])));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = br.readLine();
			}
			br.close();
			System.out.println("Dr list has been initialized.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initNurseList() {
		try {
			//will use a bufferedReader to read the text doc that stores info
			BufferedReader br = new BufferedReader(new FileReader("NurFile.txt"));
			String line = br.readLine();
			String[] UserArr = new String[6];
			while(line != null) {
				UserArr = line.split(",");
				//add new patient to the list
				try {
					NurList.add(new Nurse(UserArr[0], UserArr[1], Integer.parseInt(UserArr[2])));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = br.readLine();
			}
			br.close();
			System.out.println("Nurse list has been initialized.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//checks to see if patient exists
	public static boolean userExists(ArrayList<Patient> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					//nested if statements to require both be true.
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean userExistsD(ArrayList<Doctor> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					//nested if statements to require both be true.
					return true;
				}
			}
		}
		
		return false;
	}
	public static boolean userExistsN(ArrayList<Nurse> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					//nested if statements to require both be true.
					return true;
				}
			}
		}
		
		return false;
	}
	//returns a patient in the list.
	public static Patient getPatient(ArrayList<Patient> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					return List.get(i);
				}
			}
		}
		return null;
	}
	public static Doctor getDr(ArrayList<Doctor> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					return List.get(i);
				}
			}
		}
		return null;
	}
	public static  Nurse getNur(ArrayList<Nurse> List, String name, String password) {
		for(int i = 0; i < List.size(); i++) {
			if(name.equals(List.get(i).Name) ) {
				
				if(password.equals(List.get(i).Password)) {
					return List.get(i);
				}
			}
		}
		return null;
	}
	
	//returns the patientList
	public ArrayList<Patient> getPatientList(){
		return patientList;
	}
	public ArrayList<Doctor> getDrList(){
		return DrList;
	}
	public ArrayList<Nurse> getNurList(){
		return NurList;
	}
	//adds a pateint to the file tracking all of them.
	public static void signupPatient(String name, String pass, int age, String address, String phone, String email) {
		File PatientFile = new File("PatientFile.txt");
		try {
			FileWriter fw = new FileWriter(PatientFile, true); //true means it will append at the bottom.
			fw.write(name + ","+ pass + "," + age + "," + address + "," + phone + "," + email + "\n");
			
			
			fw.close();
			System.out.println("User added.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void signupDr(String name, String pass, int age, String address, String phone, String email) {
		File DrFile = new File("DrFile.txt");
		try {
			FileWriter fw = new FileWriter(DrFile, true); //true means it will append at the bottom.
			fw.write(name + ","+ pass + "," + age + "," + address + "," + phone + "," + email + "\n");
			
			
			fw.close();
			System.out.println("User added.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void signupNur(String name, String pass, int age, String address, String phone, String email) {
		File DrFile = new File("NurFile.txt");
		try {
			FileWriter fw = new FileWriter(DrFile, true); //true means it will append at the bottom.
			fw.write(name + ","+ pass + "," + age + "," + address + "," + phone + "," + email + "\n");
			
			
			fw.close();
			System.out.println("User added.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
