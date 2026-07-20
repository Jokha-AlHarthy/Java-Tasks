import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentManagementSystem {
    public static void main(String[] args){

        //Create Student List
        ArrayList<String> students = new ArrayList<>();
        students.add("Jokha");
        students.add("Hoor");
        students.add("Taif");
        students.add("Reem");
        students.add("Taqwa");
        students.add("Maiyda");
        students.add("Intisar");
        students.add("Shadha");
        students.add("Slima");
        students.add("Salwa");

        //Display Student Information
        //1. Total number of students
        System.out.println("Total number of students: "+students.size());

        //2. All student names with their indexes
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student "+i+":"+students.get(i));
        }

        //Add New Students

        //1. Add a student at the end of the list
        IO.println("Please enter a new student name: ");
        String endName = IO.readln();
        students.add(endName);
        System.out.println("Student added successfully");

        //2. Add a student at a specific position
        IO.println("Please enter student name: ");
        String posName = IO.readln();
        IO.println("Please enter the index position: ");
        int newIndex = Integer.parseInt(IO.readln());
        students.add(newIndex, posName);
        System.out.println("Student added successfully");

        //3. Display the updated list
        System.out.println("Updated list"+students);

        //Update Student Information

        //1. Ask the user for the student index
        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());

        //2. Replace the old name with a new name
        IO.println("Please enter name of student you want to replace: ");
        String updatedName = IO.readln();
        students.set(index, updatedName);

        //3. Display the updated ArrayList
        System.out.println("Updated list: "+students);


        //Search Student System

        //1. Ask the user to enter a student name.
        IO.println("Please enter name you want to search for: ");
        String searchName = IO.readln();
        int searchIndex = students.indexOf(searchName);
        //2. Check if the name exists
        if(searchIndex != -1){
            System.out.println("Student found");
            System.out.println("Student found at position"+searchIndex);
        }else{
            System.out.println("Student not found");
        }

        //Remove Student System

        //1. Remove a student by name.
        IO.println("Please enter student name you want to remove: ");
        String removeStudent = IO.readln();
        if(students.remove(removeStudent)){
            System.out.println("Student"+removeStudent+"removed from the list");
        }else{
            System.out.println("Student not found");
        }
        System.out.println("Current list"+students);

        //2. Remove a student by index
        IO.println("Please enter index of the student");
        int removeIndex = Integer.parseInt(IO.readln());
        if(removeIndex>= 0 && removeIndex< students.size()){
            String removedName = students.remove(removeIndex);
            System.out.println("Student "+removedName+" at index "+removeIndex);
        }else{
            System.out.println("Student not found");
        }

        //3. Display the list after removal
        System.out.println("Updated list"+students);

        //Student List Analysis
        //1. Count total students
        System.out.println("Total student count"+ students.size());

        //2. Check if the list is empty
        System.out.println("The list is empty"+students.isEmpty());


        //3. Display the first student.
        System.out.println("The first student is: "+students.get(0));

        //4. Display the last student.
        System.out.println("The last student is: "+students.get(students.size()-1));


        // Sorting Students

        //1. Create a copy of the student list.
        ArrayList<String>sortedName = new ArrayList<>(students);

        //2. Sort students alphabetically
        Collections.sort(sortedName);

        //3. Display the sorted list
        System.out.println("Original list"+students);
        System.out.println("The sorted list is"+sortedName);
    }
}
