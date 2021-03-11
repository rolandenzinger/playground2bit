public class ContactManager {
	 private Contact [] myContacts;
	    private int numberOfContacts;

	    public Contact[] getMyContacts() {
			return myContacts;
		}
		public int getNumberOfContacts() {
			return numberOfContacts;
		}
	    
	   public ContactManager() {
	      numberOfContacts = 0;
	      myContacts = new Contact [500];
	   }
	   public void addContact(Contact contact){
	    	if (numberOfContacts < 500) {
	    		myContacts[numberOfContacts] = contact;
	    	}
	    	numberOfContacts = numberOfContacts + 1;
	   }
	   public Contact searchContact(String searchName){
	      for(int i = 0; i < numberOfContacts; i++) {
	    	  if (myContacts[i].getName().equals(searchName)) {
	    		  return myContacts[i];
	    	  } 
	      }
	      return null;
	    }  

}

