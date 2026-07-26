import java.util.HashSet;

public class StudentSetManager {
    //Create the main method inside the class
    public static void main(String[] args){

        //Create a HashSet to store student IDs
        HashSet<String> studentsId = new HashSet<>();

        //Asking user to enter the number of student ID
        IO.println("Please enter number of student Id: ");
        int NumOfId = Integer.parseInt(IO.readln());

        //checking number the entered number if it's less than 0
        int totalEntered = 0;
        if(NumOfId<=0){
            IO.println("Invalid number of students");
        }else{
            //Use a for loop to read each student ID from the user
            for(int i = 0; i<NumOfId; i++){
                IO.println("Enter student ID: ");
                String id = IO.readln();
                totalEntered++;

                if(!studentsId.add(id)){
                    IO.println("Duplicate ID detected. ID was not added.");
                }
            }

            //classify the registration using an if-else statement
            String classification;
            if(studentsId.size()<5){
                classification = "Small Registration";
            } else if (studentsId.size()>= 5 && studentsId.size()<=10) {
                classification = "Medium Registration";
            } else {
                classification = "Large Registration";
            }

            //Display the following using System.out.println()
            System.out.println("The total IDs entered: "+totalEntered);
            System.out.println("The total unique student IDs: "+studentsId.size());
            System.out.println("All unique student IDs: "+studentsId);
            System.out.println("Registration classification: "+classification);
        }



    }
}
