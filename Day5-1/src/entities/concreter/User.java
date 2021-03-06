package entities.concreter;

import entities.abstracts.EntityService;

public class User implements EntityService{
	private int id;
	private String eMail;
	private String password;
	private String firstName;
	private String lastName;
	
	public User(int id, String eMail, String password, String firstName, String lastName) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	

}
