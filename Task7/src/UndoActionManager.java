import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UndoActionManager {
    //Create the main method inside the class
    public static void main(String[] args) {

        //Create a Stack<String> to store User actions
        Deque<String> userActions = new ArrayDeque<>();

        //Ask the user to enter the number of actions using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of user actions: ");
        int numOfUserAct = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if (numOfUserAct <= 0) {
            System.out.println("Invalid number of actions");
        } else {
            //Use a for loop to read each action
            for (int i = 0; i < numOfUserAct; i++) {
                System.out.println("Please enter your actions: ");
                String action = input.next();
                userActions.push(action);
            }
            System.out.println(userActions);

            //Display the following menu using a do-while loop
            int choice;
            do {
                System.out.println("1. Add Action");
                System.out.println("2. Undo Last Action");
                System.out.println("3. View Last Action");
                System.out.println("4. Search Action");
                System.out.println("5. Display All Actions");
                System.out.println("6. Display Action Statistics");
                System.out.println("7. Clear All Actions");
                System.out.println("8. Exit");

                System.out.println("Please choose number from the list: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1://Add Action
                        System.out.println("Search for user action");
                        String searchUserAct = input.next();
                        if (userActions.contains(searchUserAct)) {
                            System.out.println("User action already exists");
                        } else {
                            System.out.println("Please enter new user action");
                            String newAction = input.next();
                            userActions.push(newAction);
                            System.out.println("New user action added successfully..");
                        }
                        break;
                    case 2: //Undo Last Action
                        if (userActions.isEmpty()) {
                            System.out.println("No actions to undo");
                        } else {
                            System.out.println("Removing the last action of the user: " + userActions.pop());
                        }
                        break;
                    case 3://View Last Action
                        if (userActions.isEmpty()) {
                            System.out.println("No actions available");
                        } else {
                            System.out.println("Last action from the user is: " + userActions.peek());
                        }
                        break;
                    case 4: //Search Action
                        System.out.println("Please enter user action you want to search for: ");
                        String userAct = input.next();
                        if (userActions.contains(userAct)) {
                            System.out.println("User action found!");
                        } else {
                            System.out.println("Action not found");
                        }
                        break;
                    case 5://Display All Actions
                        for (String action : userActions) {
                            System.out.println("All user actions are as following: " + action);
                        }
                        break;
                    case 6: //Display Action Statistics
                        System.out.println("Total number of user actions: " + userActions.size());
                        System.out.println("Most recent action: " + userActions.peek());
                        System.out.println("Whether the stack is empty: " + userActions.isEmpty());
                        break;
                    case 7: //Clear All Actions
                        userActions.clear();
                        System.out.println("All actions have been cleared");
                        break;
                    case 8: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number entered..");
                }
            } while (choice != 8);
        }
        input.close();
    }
}
