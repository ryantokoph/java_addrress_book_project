package addressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<AddressEntry> book = new ArrayList<>();
	
	
//	Choice 1 "add entry"
	public void addEntry(AddressEntry newEntry) {
		book.add(newEntry);
		System.out.println("New entry added!");
	}
	
	
//	Choice 2 "remove entry"
	public void removeEntry(String email) {
		for (int i = 0; i<book.size(); i++) {
			AddressEntry lookUp = book.get(i);
			if(lookUp.getEmail().equals(email)) {
				book.remove(i);
				return;
			}
		}
	}
	
	
//	Choice 3 "search for entry"					***make 4 separate searches for each criteria***
	public AddressEntry searchByFirstName(String firstName) {
		for (int i = 0; i<book.size(); i++) {
			AddressEntry search1stName = book.get(i);
			if (search1stName.getFirstName().equals(firstName)) {
				System.out.println(search1stName);
			}
		}
		return null;
	}
	
	public AddressEntry searchByLastName(String lastName) {
		for (int i = 0; i<book.size(); i++) {
			AddressEntry searchLastName = book.get(i);
			if (searchLastName.getLastName().equals(lastName)) {
				System.out.println(searchLastName);
			}
		}
		return null;
	}
	
	public AddressEntry searchByPhoneNumber(String phoneNumber) {
		for (int i = 0; i<book.size(); i++) {
			AddressEntry searchPhoneNumber = book.get(i);
			if (searchPhoneNumber.getPhoneNumber().equals(phoneNumber)) {
				System.out.println(searchPhoneNumber);
			}
		}
		return null;
	}
	
	public AddressEntry searchByEmail(String email) {
		for (int i = 0; i<book.size(); i++) {
			AddressEntry searchEmail = book.get(i);
			if (searchEmail.getEmail().equals(email)) {
				System.out.println(searchEmail);
			}
		}
		return null;
	}
	
	
	
	
//	Choice 4 "print address book"
	public void printBook() {
		for(AddressEntry i: book) {
			System.out.println(i);
		}
	}
	
	
//	Choice 5 "delete book"
	public void deleteBook() {
		book.clear();
		System.out.println("Address book cleared!");
	}
	
	
}


