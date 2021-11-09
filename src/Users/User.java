package Users;

/*		GROUP 28
 * Gatlin Farrington, Vishok Jayaraman, Pramith Chivanna, Haydn Van Norman, Jane Seangatith
 * 
 */


public class User {
	public String Name;
	
	public String Password;
	public int Birthday;
	public String password;
	public Doctor doc;
	
	public User(String name, String password, int birthday) {
		Name = name;
		Password = password;
		Birthday = birthday;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name){
		Name = this.Name;
	}
	
	public int getBirthday() {
		return Birthday;
	}
	
	public void setBirthday(int birthday) {
		Birthday = birthday;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		password = this.password;
	}
	public void setDoctor(Doctor doc) {
		doc = this.doc;
	}
	
}
