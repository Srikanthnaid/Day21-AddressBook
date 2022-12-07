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
		contact.add(list);

	}

	public void editContact() {

		System.out.print("Enter First Name:");
		String editName = s.next();
		boolean edited = false;
		for (int i = 0; i < contact.size(); i++) {
			String name = contact.get(i).getFirstName();
			// Check name == editName.
			if (name.equalsIgnoreCase(editName)) {
				System.out.println("Name is Match  \nnow Edit contact");
				System.out.println(
						"FirstName match  \n ckoose which one you want to change  \n Enter 1 to change firatName  \nEnter 2 to change LastName  \nEnter 3 to change address  \nEnter 4 to change city  \nEnter 5 to change state  \nEnter 6 to change ZipCode  \nEnter 7 to change MobNumber  \nEnter 8 to change E-Mail Address");
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
		contact.stream().forEach(a -> System.out.println(a));
	}

	// deleting contact from the addressbook
	public void deleteContact() {
		System.out.println("Enter the first name of person to edit contact");
		String deleteName = s.next();
		boolean deleted = false;
		for (int i = 0; i < contact.size(); i++) {
			String name = contact.get(i).getFirstName();
			if (name.equalsIgnoreCase(deleteName)) {
				System.out.println("contact deleting Successfully!");
				contact.remove(i);
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			System.out.println("This name does not exist");
		}
		contact.stream().forEach(a -> System.out.println(a));
	}

	public static void main(String[] args) {
		System.out.println("--------------Welcome to addressbook--------------");

		// create a object of addressbook
		AddressBook book = new AddressBook();
		MultipleAddressBooks obj = new MultipleAddressBooks();
		while (true) {
			System.out.println("Enter \n 1. To add The new AddressBook\n 2. To add contact in AddressBook\n "
					+ "3. To edit the contact in AddressBook\n 4. To delete the contact in AddressBook\n 5. To delete the AddressBook\n "
					+ "6. To Print the AddressBook\n 7. To Print the contacts in AddressBook\n 0. to exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> obj.addAddressBook();

			case 2 -> obj.addContact();

			case 3 -> obj.editContactInBook();

			case 4 -> obj.deleteContactInBook();

			case 5 -> obj.deleteAddressBook();

			case 6 -> obj.printBook();

			case 7 -> obj.printContactsInBook();

			case 0 -> System.exit(0);

			default -> System.out.println("Enter the wrong input");

			}
		}
	}
}
