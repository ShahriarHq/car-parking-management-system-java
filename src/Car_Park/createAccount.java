package Car_Park;

public class createAccount {
	String name;
	String pass;
	String mail;
	String birth;
	public createAccount(String name, String pass, String mail, String birth) {
		this.name = name;
		this.pass = pass;
		this.mail = mail;
		this.birth = birth;
	}
	
	public String toString() {
		return  name + ", " + pass +","+mail+ ","+birth;
	}
	
	

}
