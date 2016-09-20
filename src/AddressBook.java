import java.util.*;

public class AddressBook {

	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook(ArrayList<BuddyInfo> buddies){
		 this.buddies = buddies;
	}
	
	public AddressBook(){
		 this.buddies = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo bud){
		if( bud!= null)buddies.add(bud);
	}

	public void removeBuddy(int index){
		if(index >= 0 && index < buddies.size()){
			buddies.remove(index);
		}
		
	}
	
	public static void main(String[] args){
		System.out.println("Address Book");
		BuddyInfo first = new BuddyInfo("Obi","Carleton","613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(first);
		addressBook.removeBuddy(0);
		BuddyInfo second = new BuddyInfo("Obi","Carleton","613");
		addressBook.addBuddy(second);
		addressBook.removeBuddy(0);
	}
}
