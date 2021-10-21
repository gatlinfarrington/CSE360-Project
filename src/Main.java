import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Mentcare!");
		Signup s = new Signup();
		Scanner scan = new Scanner(System.in);
//		s.writeInfo("Logan Farrington", 21, "29619 n 138th st", "602-810-4759", "ldfarrin@asu.edu");
		System.out.println("Please enter your 'name,age,address,phone,email.'");
		String input = scan.next();
		
	}

}
