import java.util.HashMap;
import java.util.HashSet;

public class CourseEnrollmentSystem {
    //Create the main method inside the class
    public static void main(String[] args){
        //A HashSet<Integer> to store unique student IDs
        HashSet<Integer> studentId = new HashSet<>();

        //A HashMap<Integer, String> to store student IDs as keys and course names as values
        HashMap<Integer, String> studentsId = new HashMap<>();

        //Ask user to enter the number of students
        IO.println("Enter the number of students: ");
        int NumOfStudent = Integer.parseInt(IO.readln());

        //Checking entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfStudent<= 0){
            IO.println("Invalid number of students");
        }else{
            //Use a for loop to read each student ID and course name
            for(int i = 0; i<NumOfStudent; i++){
                IO.println("Please enter student Id: ");
                int studId = Integer.parseInt(IO.readln());

                IO.println("Please enter course name: ");
                String courseName = IO.readln();

                //Check whether the student ID already exists in the HashSet
                if(!studentId.add(studId)){
                    IO.println("Student ID already exists. Record not added");
                }else {
                    //Add the student ID to the HashSet
                    studentId.add(studId);

                    //Add the student ID and course name to the HashMap
                    studentsId.put(studId, courseName);
                }
                totalEntered++;
            }


            //Checking if the student ID exists
            IO.println("Please student id you want to search for: ");
            int searchId = Integer.parseInt(IO.readln());
            if(studentId.contains(searchId)){
                //Ask user to enter the new course name
                IO.println("Please enter the new course name");
                String newCourse = IO.readln();
                studentsId.replace(searchId, newCourse);
                IO.println("Course updated successfully");
            }else{
                IO.println("Student ID not found");
            }

            //Use an if-else statement to classify the enrollment
            String classification;
            if(studentId.size()<5){
                classification = "Small Enrollment";
            } else if (studentId.size()>=5 && studentId.size()<=15) {
                classification ="Medium Enrollment";
            }else{
                    classification="Large Enrollment";
            }

            //Display the following using System.out.println()
            System.out.println("Total student records entered: "+totalEntered);
            System.out.println("Total unique students: "+studentId.size());
            System.out.println("All student IDs: "+studentId);
            System.out.println("All student IDs with their enrolled courses: "+studentsId);
            System.out.println("Enrollment classification: "+classification);

        }
    }
}
