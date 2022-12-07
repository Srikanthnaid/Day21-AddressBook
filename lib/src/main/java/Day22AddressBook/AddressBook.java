package Day22AddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	// uc1 -> create addressbook

	// create a array-list
	List<ContactList> contact = new ArrayList<ContactList>();

	// addcontact method using to add the contact of addressbook
	public void createContact() {
		// here we create a object of contact-list class
		ContactList list = new ContactList("Srikanth", "Naidu", "Alampur", "Hyderabad", "Telangana", 143, 63016630,
				"ksru044@gmail.com");

		/* adding contact to list */
		contact.add(list);

		// print the addressbook
		contact.stream().forEach(a -> System.out.println(a));
	}

	public static void main(String[] args) {
		System.out.println("--------------Welcome to addressbook--------------");

		// create a object of addressbook
		AddressBook book = new AddressBook();
		book.createContact();
	}
}
