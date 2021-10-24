package Users;
/*		GROUP 28
 * Gatlin Farrington, Vishok Jayaraman, Pramith Chivanna, Haydn Van Norman, Jane Seangatith
 * 
 */
public class Patient extends User{
	String email;
	String address;
	String phoneNumber;
	public Patient(String name, String password, int birthday) {
		super(name, password, birthday);
		// TODO Auto-generated constructor stub
	}
	public Patient(String name, String password, int birthday, String email, String address, String phone) {
		super(name, password, birthday);
		email = this.email;
		address = this.address;
		phoneNumber = phone;
	}
	public Patient(Patient p) {
		super(p.Name,p.Password,p.Birthday);
		email = p.email;
		address = p.address;
		phoneNumber = p.phoneNumber;	
	}
	//getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = this.email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = this.address;
	}
	
	public String getPhone() {
		return phoneNumber;
	}
	public void setPhone(String phone) {
		phoneNumber = phone;
	}
	
	

}
