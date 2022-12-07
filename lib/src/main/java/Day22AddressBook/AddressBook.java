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
	//create a method to edit a existing contact.
	public void editContact() {
		
		System.out.print("Enter First Name:");
		String editName = s.next();
		boolean edited = false;
		
		for (int i = 0; i < contact.size(); i++) {
			String name = contact.get(i).getFirstName();
			//Check name == editName.
			if (name.equalsIgnoreCase(editName)) {
				System.out.println("Name is Match  \nnow Edit contact");
				System.out.println("FirstName match  \n ckoose which one you want to change  \n Enter 1 to change firatName  \nEnter 2 to change LastName  \nEnter 3 to change address  \nEnter 4 to change city  \nEnter 5 to change state  \nEnter 6 to change ZipCode  \nEnter 7 to change MobNumber  \nEnter 8 to change E-Mail Address");
				int input = s.nextInt();
				switch (input) {
				case 1:
					System.out.print("Enter firstname: ");
					list.setFirstName(s.next());
					break;
				case 2:
					System.out.print("Enter lastname: ");
					list.setLastName(s.next());
					break;
				case 3:
					System.out.print("Enter Address: ");
					list.setAddress(s.next());
					break;
				case 4:
					System.out.print("Enter City: ");
					list.setCity(s.next());
					break;
				case 5:
					System.out.print("Enter State: ");
					list.setState(s.next());
					break;
				case 6:
					System.out.print("Enter ZipCode: ");
					list.setZip(s.nextInt());
					break;
				case 7:
					System.out.print("Enter PhoneNumber: ");
					list.setPhoneNumber(s.next());
					break;
				case 8:
					System.out.print("Enter E-Mail Address: ");
					list.setEmail(s.next());
					break;
				}
				
				edited = true;
				break;
			}
		}
		if (!edited) {
			System.out.println("This name does not exist");
		}
		contact.stream().forEach(a->System.out.println(a));
	}

	public static void main(String[] args) {
		System.out.println("--------------Welcome to addressbook--------------");

		// create a object of addressbook
		AddressBook book = new AddressBook();
		book.addContact();//call add contact method
		book.editContact();//call edit contact method to edit a contact in addressbook.
	}
}
