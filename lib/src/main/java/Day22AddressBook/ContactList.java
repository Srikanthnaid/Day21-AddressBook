package Day22AddressBook;

public class ContactList {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip_code;
	private int phoneNumber;
	private String email;

	/*
	 * Parameterized constructor
	 */
	public ContactList(String fn, String ln, String add, String city, String state, int zip, int ph, String email) {
		super();
		this.firstName = fn;
		this.lastName = ln;
		this.address = add;
		this.city = city;
		this.state = state;
		this.zip_code = zip;
		this.phoneNumber = ph;
		this.email = email;
	}

	/*
	 * Getter and Setter methods
	 */
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String addess) {
		this.address = addess;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip_Code() {
		return zip_code;
	}

	public void setZip_Code(int zip_code) {
		this.zip_code = zip_code;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * toString() method return the string representation of the object.
	 */
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip_code + ", phone=" + phoneNumber + ", email=" + email + "]";
	}
}
