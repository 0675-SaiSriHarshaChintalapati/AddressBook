import java.util.*;

public class AddressBook {
    List<Contact> contacts;
    public AddressBook(){
        this.contacts=new ArrayList<>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void displayContacts(){
        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }




}
