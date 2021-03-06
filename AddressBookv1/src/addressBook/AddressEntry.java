package addressBook;

import java.util.Scanner;

public class AddressEntry {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressEntry(String firstName, String lastName, String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public static AddressEntry addressFromInput(Scanner input) {
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter phoneNumber: ");
		String phoneNumber = input.nextLine();
		System.out.println("Enter email address: ");
		String email = input.nextLine();
		
		AddressEntry returnValue = new AddressEntry(firstName, lastName, phoneNumber, email);
		return returnValue;
	}
	
	@Override
	public String toString() {
		return firstName + "\n" + lastName + "\n" + phoneNumber + "\n" + email + "\n\n";
	}
	
	
}
