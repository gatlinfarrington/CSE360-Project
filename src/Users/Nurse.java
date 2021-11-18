package Users;

/*		GROUP 28
 * Gatlin Farrington, Vishok Jayaraman, Pramith Chivanna, Haydn Van Norman, Jane Seangatith
 * 
 */

public class Nurse extends User{

	public Nurse(String name, String password, int birthday) {
		super(name, password, birthday);
		
	}
	public String getName() {
		return Name;
	}
	public String getPassword() {
		return Password;
	}
	public boolean isPat() {
		return false;
	}

}
