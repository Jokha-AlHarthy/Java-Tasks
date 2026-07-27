import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniversityCourseRegistrationSystem {
    //Create the main method inside the class
    public static void main(String[] args) {

        //A HashSet<Integer> to store unique student IDs
        HashSet<Integer> studentId = new HashSet<>();

        //A HashMap<Integer, HashSet<String>> to store each student ID and the set of courses registered by that student
        HashMap<Integer, HashSet<String>> studentCourse = new HashMap<>();

        //Ask user to enter the number of students
        IO.println("Please enter number of students: ");
        int NumOfStudents = Integer.parseInt(IO.readln());

        //Checking If the entered number is less than or equal to 0
        if (NumOfStudents <= 0) {
            IO.println("Invalid number of students");
        } else {
            //for each student
            for (int i = 0; i < NumOfStudents; i++) {
                //Enter student Id
                IO.println("Please enter student id: ");
                int studId = Integer.parseInt(IO.readln());

                //Check if the student ID already exists
                if (studentId.contains(studId)) {
                    IO.println("Student ID already exists");
                } else {
                    //Add the student ID to the HashSet
                    studentId.add(studId);

                    //Ask the user for the number of courses
                    IO.println("Please enter number of courses: ");
                    int numOfCourses = Integer.parseInt(IO.readln());

                    //Create HashSet for course names to avoid duplicates
                    HashSet<String> courseSet = new HashSet<>();
                    for (int j = 0; j < numOfCourses; j++) {
                        IO.println("Enter course name: ");
                        String course = IO.readln();
                        if (!courseSet.add(course)) {
                            IO.println("Duplicated course name!");
                        }
                    }

                    //storing student and thier course
                    studentCourse.put(studId, courseSet);
                }
            }
            //Display a menu that repeats until the user chooses to exit
            int choice = 0;
            while (choice != 6) {
                IO.println("1. Search Student");
                IO.println("2. Add Course to Student");
                IO.println("3. Remove Course from Student");
                IO.println("4. Display All Students");
                IO.println("5. Display Registration Statistics");
                IO.println("6. Exit");

                IO.println("Please choose on of the choices:");
                choice = Integer.parseInt(IO.readln());

                switch (choice) {
                    case 1://Search Student
                        //Ask for a student ID
                        IO.println("Enter student Id you want to search for: ");
                        int searchId = Integer.parseInt(IO.readln());
                        if (studentId.contains(searchId)) {
                            //Display all registered courses if found
                            IO.println(studentCourse.get(searchId));
                        } else {
                            //Otherwise display
                            IO.println("Student not found");
                        }
                        break;
                    case 2://Add Course
                        IO.println("Enter student Id to add course: ");
                        int searchId1 = Integer.parseInt(IO.readln());
                        //If found, ask for a course name
                        if (studentCourse.containsKey(searchId1)) {
                            //ask for a course name
                            IO.println("Please enter new course you want to add");
                            String newCourse = IO.readln();
                            HashSet<String> courses = studentCourse.get(searchId1);
                            if (courses.contains(newCourse)) {
                                IO.println("course exists!");
                            } else {
                                courses.add(newCourse);
                                IO.println("Course added successfully");
                            }
                        } else {
                            IO.println("Id not found");
                        }
                        break;
                    case 3: //Remove Course
                        //Ask for a student ID
                        IO.println("Enter student Id to remove course: ");
                        int searchId2 = Integer.parseInt(IO.readln());

                        if (studentCourse.containsKey(searchId2)) {
                            //Ask for a course name
                            IO.println("Enter student course name: ");
                            String removeCourse = IO.readln();
                            HashSet<String> courses = studentCourse.get(searchId2);
                            if (courses.remove(removeCourse)) {
                                IO.println("Course removed successfully");
                            } else {
                                IO.println("Course not found!");
                            }
                        } else {
                            IO.println("Student not found");
                        }
                        break;
                    case 4: //Display All Students
                        for (Map.Entry<Integer, HashSet<String>> entry : studentCourse.entrySet()) {
                            IO.println("Student ID: " + entry.getKey() + " | Courses: " + entry.getValue());
                        }
                        break;
                    case 5:
                        int totalStudents = studentId.size();
                        if (totalStudents == 0) {
                            IO.println("No students registered!");
                            break;
                        }
                        //Display Registration Statistics
                        int totalCourses = 0;
                        int highestCourse = -1;
                        int lowestCourse = Integer.MAX_VALUE;
                        int maxStudentId = -1;
                        int minStudentId = -1;
                        for (Map.Entry<Integer, HashSet<String>> entry : studentCourse.entrySet()) {
                            int studentIdKey = entry.getKey();
                            int courseCount = entry.getValue().size();
                            totalCourses += courseCount;
                            if (courseCount > highestCourse) {
                                highestCourse = courseCount;
                                maxStudentId = studentIdKey;
                            }
                            if (courseCount < lowestCourse) {
                                lowestCourse = courseCount;
                                minStudentId = studentIdKey;
                            }
                        }
                        double average = (double) totalCourses / totalStudents;
                        System.out.println("Total number of students" + totalStudents);
                        System.out.println("Total number of course registrations" + totalCourses);
                        System.out.println("Student " + maxStudentId + " with the highest number of registered courses " + highestCourse);
                        System.out.println("Student " + minStudentId + " with the lowest number of registered courses " + lowestCourse);
                        System.out.println("Average number of courses per student: " + average);
                        break;
                    case 6:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number entered");
                }
            }

        }
    }
}

