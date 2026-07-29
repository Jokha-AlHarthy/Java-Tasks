import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StudentNameManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Declare all variables required to solve the problem
        Deque<String>studentNames = new ArrayDeque<>();

        //user to enter the number of students using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of student: ");
        int numOfStudent = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if(numOfStudent<= 0){
            System.out.println("Invalid number of students");
        }else{
            //Use a for loop to read each student name
            for(int i = 0; i<numOfStudent; i++){
                System.out.println("Enter name of student: ");
                String names = input.next();
                studentNames.push(names);
            }
            System.out.println(studentNames);

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Student Name");
                System.out.println("2. Search Student Name");
                System.out.println("3. Update Student Name");
                System.out.println("4. Display All Student Names");
                System.out.println("5. Analyze Names");
                System.out.println("6. Compare Two Names");
                System.out.println("7. Exit");

                System.out.println("Please choose one number from the list");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Add Student Name
                        System.out.println("Search of student exist or not");
                        String addNewStudent = input.next();

                        //Check if the name already exists using equals()
                        if(studentNames.contains(addNewStudent)){
                            System.out.println("Student name already exists");
                        }else{
                            studentNames.push(addNewStudent);
                            System.out.println("Student added successfully..");
                        }
                        break;
                    case 2: //Search Student Name
                        System.out.println("Search for student if exist or not");
                        String searchStudent = input.next();
                        if(studentNames.contains(searchStudent)){
                            System.out.println("Student found");
                        }else{
                            System.out.println("Student not found");
                        }
                        break;
                    case 3://Update Student Name
                        System.out.println("Search for student name if exist or not");
                        String updateStudent = input.next();
                        if(studentNames.contains(updateStudent)){
                            //Ask the user for New student name
                            System.out.println("Enter new name of student");
                            String newName = input.next();
                            Deque<String>tempStack = new ArrayDeque<>();
                            while(!studentNames.isEmpty()){
                                String currentName = studentNames.pop();
                                if(currentName.equals(updateStudent)){
                                    tempStack.push(newName);
                                }else{
                                    tempStack.push(currentName);
                                }
                            }
                            while(!tempStack.isEmpty()){
                                studentNames.push(tempStack.pop());
                            }
                            System.out.println("Student name updated successfully..");
                        }else{
                            System.out.println("Student not found..");
                        }
                        break;
                    case 4: //Display All Student Names
                        //Use a loop to display all student names with numbering
                        if(studentNames.isEmpty()){
                            System.out.println("No student registered!");
                        }else{
                            int count = 1;
                            for(String name: studentNames){
                                System.out.println(count + ". "+name);
                                count++;
                            }
                        }
                        break;
                    case 5://Analyze Names
                        if(studentNames.isEmpty()){
                            System.out.println("No student registered!");
                            break;
                        }
                        int totalStudents = studentNames.size();
                        String longest = "";
                        String shortest = null;
                        int totalChars = 0;
                        int startA = 0;
                        int endA = 0;

                        for(String name : studentNames){
                            totalChars+= name.length();
                            if(name.length() > longest.length()){
                                longest = name;
                            }
                            if(shortest == null || name.length() < shortest.length()){
                                shortest = name;
                            }
                            if(name.toUpperCase().startsWith("A")){
                                startA++;
                            }
                            if(name.toLowerCase().endsWith("a")){
                                endA++;
                            }
                        }
                        double average = (double) totalChars / totalStudents;
                        System.out.println("Total number of students: "+ totalStudents);
                        System.out.println("Longest student name: "+longest);
                        System.out.println("Shortest student name: "+shortest);
                        System.out.println("Total characters in all names: "+totalChars);
                        System.out.println("Average name length: "+average);
                        System.out.println("Number of names starting with (A): "+startA);
                        System.out.println("Number of names ending with (a)"+ endA);
                        break;
                    case 6: //Compare Two Names
                        System.out.println("Enter name of student 1: ");
                        String student1 = input.next();

                        System.out.println("Enter name of student2: ");
                        String student2 = input.next();

                        System.out.println("equals():  "+ student1.equals(student2));
                        System.out.println("equalsIgnoreCase(): "+student1.equalsIgnoreCase(student2));
                        System.out.println("compareTo(): "+ student1.compareTo(student2));
                        break;
                    case 7: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }
            }while(choice!=7);
        }
        input.close();
    }
}
