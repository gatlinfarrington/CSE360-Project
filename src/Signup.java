import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Signup {
	String name;
	int age;
	String address;
	String phoneNumber;
	String email;
	public File infoFile = new File("infoFile.txt");
	
	public Signup() throws IOException {
		name = "";
		age = 0;
		address = "";
		phoneNumber = "";
		email = "";
		if(infoFile.createNewFile()) {
			System.out.println("infoFile.txt was Created");
		}else {
			System.out.println("Opening infoFile.txt");
		}
	}
	
	public String parseInput(String input) {
		
		
		return null;
	}
	
	public void writeInfo(String name, int age,String address, String phone, String email) {
		try {
			
			
			
			FileWriter fw = new FileWriter(infoFile, true); //true means it will append at the bottom.
			fw.write(name + "," + age + "," + address + "," + phone + "," + email + "\n");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
