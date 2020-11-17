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
	 // Returns a non-neg integer if a Contact with name s exists corresponding
	    // to which place in the array friends the Contact is stored. Returns -1
	    // otherwise.
	    private int haveContact(String s) {
		
			for (int i=0;i<numfriends;i++)
		    	if (friends[i].getName().equals(s))
					return i;
			return -1;
	    }

	    // Deletes a contact with name s, if one is in the AddressBook.
	    public void deleteContact(String s) {
		
			int place = haveContact(s);
			if (place >= 0) {
		    	friends[place] = friends[numfriends-1];
		    	numfriends--;
			}
	    }
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
	}
}

    
