import java.util.*;

public class StudentRegistrationManager {
    //Create the main method inside the class
    public static void main(String[] args) {
        // Create the following data structures Queue<String> using LinkedList to store Students waiting for registration
        Queue<String> studentsWaitingReg = new LinkedList<>();

        //Create the following data structures Stack<String> to store Completed registrations
        Deque<String> studentCompletedReg = new ArrayDeque<>();

        //Ask user to enter the number of students waiting for registration using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of students are waiting for registration: ");
        int numOfStudents = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if (numOfStudents <= 0) {
            System.out.println("Invalid number of students");
        } else {
            //Use a for loop to read each student name
            for (int i = 0; i < numOfStudents; i++) {
                System.out.println("Please enter name of each student: ");
                String name = input.next();
                studentsWaitingReg.add(name);
                System.out.println("Student added successfully..");
            }

            //Display the following menu using a do-while loop
            int choice;
            do {
                System.out.println("1. Add Student to Queue");
                System.out.println("2. Process Student Registration");
                System.out.println("3. View Next Student");
                System.out.println("4. Undo Last Registration");
                System.out.println("5. Search Student");
                System.out.println("6. Display Waiting Students");
                System.out.println("7. Display Registered Students");
                System.out.println("8. Display Statistics");
                System.out.println("9. Exit");

                System.out.println("Please enter number from the list: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1: //Add Student to Queue
                        System.out.println("Please enter student name: ");
                        String studName = input.next();
                        studentsWaitingReg.add(studName);
                        System.out.println("Student added to registration queue successfully");
                        break;
                    case 2: //Process Student Registration
                        if (studentsWaitingReg.isEmpty()) {
                            System.out.println("No students waiting for registration");
                        } else {
                            String student = studentsWaitingReg.remove();
                            studentCompletedReg.push(student);
                            System.out.println("Student registration completed");
                        }
                        break;
                    case 3: //View Next Student
                        if (studentsWaitingReg.isEmpty()) {
                            System.out.println("No students in the queue");
                        } else {
                            System.out.println("Display the next student: " + studentsWaitingReg.element());
                        }
                        break;
                    case 4: //Undo Last Registration
                        if (studentCompletedReg.isEmpty()) {
                            System.out.println("No registrations to undo");
                        } else {
                            System.out.println("Remove the last registered student: " + studentCompletedReg.pop());
                        }
                        break;
                    case 5: //Search Student
                        System.out.println("Please enter student name you want to search for: ");
                        String searchStudent = input.next();
                        if (studentsWaitingReg.contains(searchStudent)) {
                            System.out.println("Student waiting for registration");
                        } else if (studentCompletedReg.contains(searchStudent)) {
                            System.out.println("Student already registered ");
                        } else {
                            System.out.println("Student not found..");
                        }
                        break;
                    case 6://Display Waiting Students
                        if (studentsWaitingReg.isEmpty()) {
                            System.out.println("No waiting students");
                        } else {
                            for (String name : studentsWaitingReg) {
                                System.out.println("Display all students in the queue: " + name);
                            }
                        }
                        break;
                    case 7: //Display Registered Students
                        if (studentCompletedReg.isEmpty()) {
                            System.out.println("No registered students");
                        } else {
                            for (String name : studentCompletedReg) {
                                System.out.println("Display all registered students in the stack: " + name);
                            }
                        }
                        break;
                    case 8: //Display Statistics
                        System.out.println("Total waiting students: " + studentsWaitingReg.size());
                        System.out.println("Total registered students: " + studentCompletedReg.size());
                        System.out.println("Next student waiting: " + studentsWaitingReg.element());
                        System.out.println("Last registered student: " + studentCompletedReg.peek());
                        System.out.println("Check if queue is empty: " + studentsWaitingReg.isEmpty());
                        System.out.println("Check if stack is empty: " + studentCompletedReg.isEmpty());
                        break;
                    case 9: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number");
                }
            } while (choice != 9);
        }
        input.close();
    }
}
