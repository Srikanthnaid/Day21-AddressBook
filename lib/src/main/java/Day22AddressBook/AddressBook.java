package Day22AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	// uc2 -> Add contact to addressbook.

	// create a array-list
	List<ContactList> contact = new ArrayList<ContactList>();

	// create contactlist class object.
	ContactList list = new ContactList();
	// scanner class
	static Scanner s = new Scanner(System.in);

	public void addContact() {

		System.out.print("Enter first name: ");
		list.setFirstName(s.next());
		System.out.print("Enter last name: ");
		list.setLastName(s.next());
		System.out.print("Enter address: ");
		list.setAddress(s.next());
		System.out.print("Enter city: ");
		list.setCity(s.next());
		System.out.print("Enter state: ");
		list.setState(s.next());
		System.out.print("Enter zip: ");
		list.setZip(s.nextInt());
		System.out.print("Enter phone number: ");
		list.setPhoneNumber(s.next());
		System.out.print("Enter E-Mail: ");
		list.setEmail(s.next());
		/* adding to arraylist */
		contact.add(list);
		/* print the arraylist */
		contact.stream().forEach(a -> System.out.println(a));
	}

	public static void main(String[] args) {
		System.out.println("--------------Welcome to addressbook--------------");

		// create a object of addressbook
		AddressBook book = new AddressBook();
		book.addContact();
	}
}
