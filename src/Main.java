import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Mentcare!");
		Signup s = new Signup();
		s.writeInfo("Logan Farrington", 21, "29619 n 138th st", "602-810-4759", "ldfarrin@asu.edu");
	}

}
