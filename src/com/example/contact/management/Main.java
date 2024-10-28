import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Remove Contact");
            System.out.println("5. Update Contact Phone Number");
            System.out.println("6. Display Unique Email Domains");
            System.out.println("7. Sort and Display Contacts (Alphabetically)");
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactManager.addContact(name, phoneNumber, email);
                    break;
                case 2:
                    contactManager.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    contactManager.searchContact(name);
                    break;
                case 4:
                    System.out.print("Enter name to remove: ");
                    name = scanner.nextLine();
                    contactManager.removeContact(name);
                    break;
                case 5:
                    System.out.print("Enter name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    phoneNumber = scanner.nextLine();
                    contactManager.updatePhoneNumber(name, phoneNumber);
                    break;
                case 6:
                    contactManager.displayUniqueDomains();
                    break;
                case 7:
                    contactManager.sortAndDisplayContacts();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

