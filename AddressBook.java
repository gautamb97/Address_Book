package addressbook;


public class AddressBook {
	 private Contact[] friends; // An array of Contacts - each stores info for one friend
	    private int numfriends; // Number of friends currently in AddressBook

	    // Create an empty AddressBook
	    public AddressBook() {
			friends = new Contact[10];
			numfriends = 0;
	    }
	 // Add a contact that's passed in as a parameter.
	    public void addContact(Contact c) {
			friends[numfriends] = c;
			numfriends++;
	    }

	    // Print out info on all contacts using method Contact class.
	    public void printContacts() {
			for (int i=0;i<numfriends;i++)
		    	friends[i].printContact();
	    }

	    // Returns the number of friends currently in AddressBook
	    public int numContacts() {
			return numfriends;
	    }
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
	}
}

    
