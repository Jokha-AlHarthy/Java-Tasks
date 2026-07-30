import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketQueueManager {
    //Create the main method inside the class
    public static void main(String[] args) {
        //Create a Queue<String> using LinkedList to store Customer names
        Queue<String> customerNames = new LinkedList<>();

        //Prompt the user to enter the number of customers using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of customers: ");
        int numOfCustomers = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if (numOfCustomers <= 0) {
            System.out.println("Invalid number of customers");
        } else {
            //Use a for loop to read each customer name
            for (int i = 0; i < numOfCustomers; i++) {
                System.out.println("Please enter customer name: ");
                String name = input.next();
                customerNames.add(name);
            }

            //Display the following menu using a do-while loop
            int choice;
            do {
                System.out.println("1. Add Customer");
                System.out.println("2. Serve Customer");
                System.out.println("3. View Next Customer");
                System.out.println("4. Search Customer");
                System.out.println("5. Display All Customers");
                System.out.println("6. Display Queue Statistics");
                System.out.println("7. Exit");

                System.out.println("Please enter number from the list: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1: //Add Customer
                        System.out.println("Please enter customer name: ");
                        String custName = input.next();
                        customerNames.add(custName);
                        System.out.println("Customer added successfully");
                        break;
                    case 2: //Serve Customer
                        if (customerNames.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            System.out.println("Remove the first customer from queue: " + customerNames.remove());
                        }
                        break;
                    case 3: //View Next Customer
                        if (customerNames.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            System.out.println("Display the next customer: " + customerNames.element());
                        }
                        break;
                    case 4: //Search Customer
                        System.out.println("Please enter customer name you want to search for: ");
                        String searchName = input.next();
                        if (customerNames.contains(searchName)) {
                            System.out.println("Customer found in queue");
                        } else {
                            System.out.println("Customer not found");
                        }
                        break;
                    case 5: //Display All Customers
                        if (customerNames.isEmpty()) {
                            System.out.println("Queue is empty");
                        } else {
                            for (String name : customerNames) {
                                System.out.println("Displaying all customers: " + name);
                            }
                        }
                        break;
                    case 6: //Display Queue Statistics
                        System.out.println("Total number of customers: " + customerNames.size());
                        System.out.println("First customer in the queue: " + customerNames.element());
                        String lastCustomer = "";
                        for (String last : customerNames) {
                            lastCustomer = last;
                        }
                        System.out.println("Last customer in the queue: " + lastCustomer);
                        System.out.println("Check if the queue is empty: " + customerNames.isEmpty());
                        break;
                    case 7: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
            } while (choice != 7);
        }
        input.close();
    }
}
