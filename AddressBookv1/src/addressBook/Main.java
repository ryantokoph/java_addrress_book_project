package addressBook;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AddressBook bookNew = new AddressBook();
		String choice;
		boolean done = false;
		do {
			
			
			System.out.println("1) Add an entry\n2) Remove an entry\n3) Search for a specific entry\n"
					+ "4) Print address book\n5) Delete Book\n6) Quit");
			System.out.println("\nPlease choose what you'd like to do with the database (1-6): ");
	
			choice = input.nextLine();
			if (choice.equals("1")){
				AddressEntry entry = AddressEntry.addressFromInput(input);
				bookNew.addEntry(entry);
			}
			else if (choice.equals("2")) {
				System.out.println("Please enter the email of the entry you'd like to remove: ");
				String removed = input.nextLine();
				bookNew.removeEntry(removed);
			}
			else if (choice.equals("3")) {
				System.out.println("1) First Name\n2) Last Name\n3) Phone Number\n4) Email");
				System.out.println("Please choose what to search by (1-4): ");
				String nestedChoice = input.nextLine();
				if(nestedChoice.equals("1")) {
					System.out.println("Please enter a first name");
					String firstName = input.nextLine();
					bookNew.searchByFirstName(firstName);
				}
				
				else if(nestedChoice.equals("2")) {
					System.out.println("Please enter a last name");
					String lastName = input.nextLine();
					bookNew.searchByLastName(lastName);
				}
				
				else if(nestedChoice.equals("3")) {
					System.out.println("Please enter a phone number");
					String phoneNumber = input.nextLine();
					bookNew.searchByPhoneNumber(phoneNumber);
				}
				
				else if(nestedChoice.equals("4")) {
					System.out.println("Please enter an email");
					String email = input.nextLine();
					bookNew.searchByEmail(email);
				}
				
				else {
					System.out.println("Please pick a number 1-4");
				}
				
				
			}
			else if (choice.equals("4")) {
				bookNew.printBook();
			}
			else if (choice.equals("5")) {
				bookNew.deleteBook();
			}
			else if (choice.equals("6")) {
				done = true;	
			}
			else {
				System.out.println("Please choose a number between 1 and 6");
			}
		} while (!done);

	}

}
