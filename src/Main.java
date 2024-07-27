import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook addressBook=new AddressBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Last Name: ");
        String lastName=sc.nextLine();
        System.out.println("Address: ");
        String address=sc.nextLine();
        System.out.println("City: ");
        String city=sc.nextLine();
        System.out.println("State: ");
        String state=sc.nextLine();
        System.out.println("Zip: ");
        String zip=sc.nextLine();
        System.out.println("Phonenumber: ");
        String phoneNumber=sc.nextLine();
        System.out.println("Email: ");
        String email= sc.nextLine();
        Contact contact=new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        addressBook.addContact(contact);
        System.out.println("Contact added successfully");
        addressBook.displayContacts();

    }
}