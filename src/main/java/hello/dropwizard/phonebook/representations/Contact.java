package hello.dropwizard.phonebook.representations;

public class Contact {

	private int id;
	private String firstname;
	private String lastname;
	private String phone;

	public Contact() {}
	
	public Contact(int id, String firstname, String lastname, String phone) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
