import java.util.HashSet;

public class CourseEnrollmentSet {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a HashSet<String> to store course names
        HashSet<String> courseName = new HashSet<>();

        //Prompt the user to enter the number of courses using a Scanner
        IO.println("Please enter number of courses: ");
        int NumOfCourses = Integer.parseInt(IO.readln());

        //If the entered number is less than or equal to 0\
        int totalEntered = 0;
        if(NumOfCourses<=0){
            IO.println("Invalid number of courses");
        }else{
            //Use a for loop to read each course name from the user
            for(int i =0; i<NumOfCourses; i++){
                IO.println("Enter name of the course: ");
                String name = IO.readln();
                totalEntered++;

                //If a duplicate course name is entered
                if(!courseName.add(name)){
                    IO.println("Course already exists. Duplicate entries are not allowed");
                }
            }

            //Asking user to remove course from the set
            IO.println("Enter course you want to remove: ");
            String removeCourse = IO.readln();

            //checking if the course removed or not
            String removeResult;
            if(courseName.remove(removeCourse)){
                removeResult = "Course removed successfully";
            }else{
                removeResult = "Course not found";
            }

            //Use an if-else statement to classify the remaining courses
            String classification;
            if(courseName.size()<4){
                classification = "Small Course Catalog";
            } else if (courseName.size()>=4 && courseName.size()<=8) {
                classification = "Medium Course Catalog";
            }else{
                classification = "Large Course Catalog";
            }

            //Display the following using System.out.println()
            System.out.println("Total courses entered: "+totalEntered);
            System.out.println("Total unique courses remaining: "+courseName.size());
            System.out.println("All remaining course name"+courseName);
            System.out.println("Course "+removeCourse+" Removal result"+removeResult);
            System.out.println("Course catalog classification"+classification);
        }

    }
}
