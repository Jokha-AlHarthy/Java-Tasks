import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerQueueManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a Queue<String> using LinkedList to store Customer name
        Queue<String>customerNames = new LinkedList<>();

        //Ask the user to enter the number of customers using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number customers: ");
        int numOfCutomers = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if(numOfCutomers <= 0){
            System.out.println("Invalid number of customers");
        }else{
            //Use a for loop to read each customer name
            for(int i=0; i<numOfCutomers; i++){
                System.out.println("Enter customer names: ");
                String custName = input.next();
                customerNames.offer(custName);
            }

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Customer");
                System.out.println("2. Serve Customer");
                System.out.println("3. View Next Custome");
                System.out.println("4. Search Customer");
                System.out.println("5. Display All Customers");
                System.out.println("6. Display Queue Statistics");
                System.out.println("7. Exit");

                System.out.println("Please enter number from the list");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Add Customer
                        System.out.println("Please enter your name: ");
                        String newCustomer = input.next();
                        customerNames.offer(newCustomer);
                        System.out.println("Customer added successfully");
                        break;
                    case 2: //Serve Customer
                        if(customerNames.isEmpty()){
                            System.out.println("No customers in the queue");
                        }else{
                            System.out.println("Displaying the served customer's name: "+customerNames.poll());
                        }
                        break;
                    case 3: //View Next Customer
                        if(customerNames.isEmpty()){
                            System.out.println("No customers in the queue");
                        }else{
                            System.out.println("Displaying the first customer name: "+customerNames.peek());
                        }
                        break;
                    case 4: //Search Customer
                        System.out.println("Please enter name of customer you want to search for: ");
                        String searchName = input.next();
                        if(customerNames.contains(searchName)){
                            System.out.println("Customer name exists");
                        }else {
                            System.out.println("Customer name not found");
                        }
                        break;
                    case 5: //Display All Customers
                        if(customerNames.isEmpty()){
                            System.out.println("No customers in the queue");
                        }else{
                            for(String name: customerNames){
                                System.out.println("Displaying all customer names: "+name);
                            }
                        }
                        break;
                    case 6: //Display Queue Statistics
                        System.out.println("Total number of customers: "+customerNames.size());
                        System.out.println("First customer in the queue: "+customerNames.peek());
                        String lastCustomer = "";
                        for(String last: customerNames){
                            lastCustomer = last;
                        }
                        System.out.println("Last customer in the queue: "+ lastCustomer);
                        System.out.println("Whether the queue is empty"+customerNames.isEmpty());
                        break;
                    case 7: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }
            }while (choice!= 7);
        }
        input.close();
    }
}
