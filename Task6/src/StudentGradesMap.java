import java.util.HashMap;

public class StudentGradesMap {
    //Create the main method inside the class
    public static void main(String[] args){

        //Create a HashMap<Integer, Double> to store student IDs as keys and student grades as values
        HashMap<Integer, Double> studentId = new HashMap<>();

        //Ask user to enter the number of students
        IO.println("Enter number of students: ");
        int NumOfStudent = Integer.parseInt(IO.readln());

        //checking if entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfStudent<=0){
            IO.println("Invalid number of students");
        }else{

            //Use a for loop to read each student ID and grade
            for(int i = 0; i<NumOfStudent; i++) {
                IO.println("Enter student Id: ");
                int studId = Integer.parseInt(IO.readln());

                IO.println("Enter student grade: ");
                double grade = Double.parseDouble(IO.readln());
                totalEntered++;

                //checking If the student ID already exists
                if (studentId.containsKey(studId)) {
                    IO.println("Student ID already exists. Record not added");
                } else {
                    // add the student ID and grade to the map
                    studentId.put(studId, grade);
                }

            }

            //If the student ID exists
            IO.println("Enter student ID to update: ");
            int updateId = Integer.parseInt(IO.readln());

            String result;
            if (studentId.containsKey(updateId)) {
                IO.println("Enter new grade: ");
                double newGrade = Double.parseDouble(IO.readln());
                studentId.replace(updateId, newGrade);
                result = "Grade updated successfully.";
            } else {
                result = "Student ID not found.";
            }
            IO.println(result);

            //Calculate the average grade of all students in the map
            double average = 0;
            double sum = 0;
            String classification ;
            for(double g: studentId.values()){
                sum+= g;
            }
            average = sum / studentId.size();

            if(average < 60){
                classification = "Needs Improvement";
            } else if (average>=60 && average<84) {
                classification = "Good Performance";
            }else {
                classification = "Excellent Performance";
            }

            //Display the following using System.out.println()
            System.out.println("Total student records: "+totalEntered);
            System.out.println("All student IDs and grades: "+studentId);
            System.out.println("Average grade: "+average);
            System.out.println("Class performance classification: "+classification);
        }
    }
}
