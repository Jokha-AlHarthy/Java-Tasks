import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAttendanceManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a HashMap<Integer, Integer> to store Student ID as the key and Number of attended days as the value
        HashMap<Integer, Integer> studentAttendance = new HashMap<>();

        Scanner input = new Scanner(System.in);
        //Ask user to enter the number of student records
        System.out.println("Please enter number of student records you want: ");
        int NumOfStudents = input.nextInt();

        //Checking  If the entered number is less than or equal to 0
        if(NumOfStudents<=0){
            System.out.println("Invalid number of students");
        }else{
            //Use a for loop to read each student ID and the number of attended days
            for(int i=0; i<NumOfStudents; i++){
                //Checking if student Id already exists
                System.out.println("Please enter student Id: ");
                int studentId = input.nextInt();

                System.out.println("Please enter the number of student attendance: ");
                int studAttendance = input.nextInt();

                //If the student ID already exists
                if(studentAttendance.containsKey(studentId)){
                    System.out.println("Student ID already exists. Record not added");
                }else{
                    //add the record to the HashMap
                    studentAttendance.put(studentId, studAttendance);
                }
            }

            //Display the following menu using a do-while loop
            int choice;
            do {
                System.out.println("1. Add Student Record");
                System.out.println("2. Search Student Attendance");
                System.out.println("3. Update Attendance");
                System.out.println("4. Remove Student Record");
                System.out.println("5. Display All Attendance Records");
                System.out.println("6. Display Attendance Statistics");
                System.out.println("7. Exit");

                System.out.println("Please choose one of choice: ");
                choice = input.nextInt();

                switch (choice){
                    case 1://Add Student Record
                        System.out.println("Enter student Id you want to search for: ");
                        int addStudentId = input.nextInt();

                        //Checking if the student found or not to add student record
                        if(studentAttendance.containsKey(addStudentId)){
                            System.out.println("Student record is exists");
                        }else{
                            System.out.println("Please enter the new record of the student: ");
                            int addStudentRecord = input.nextInt();
                            studentAttendance.put(addStudentId, addStudentRecord);
                            System.out.println("Student added successfully!");
                        }
                        break;
                    case 2://Search Student Attendance
                        //Checking if the student found or not
                        System.out.println("Enter student Id you want to search for: ");
                        int searchId = input.nextInt();
                        if(studentAttendance.containsKey(searchId)){
                            System.out.println("Student record found: "+studentAttendance.get(searchId));
                        }else{
                            System.out.println("Student not found..");
                        }
                        break;
                    case 3://Update Attendance
                        //Checking if the student found or not to update the attendance
                        System.out.println("Please enter student Id you want to search for");
                        int searchStudent = input.nextInt();
                        if(studentAttendance.containsKey(searchStudent)){
                            //Ask user to enter the new attendance record
                            System.out.println("Please enter the new student attendance record: ");
                            int newRecord = input.nextInt();
                            studentAttendance.replace(searchStudent, newRecord);
                            System.out.println("Student attendance record updated successfully..");
                        }else{
                            System.out.println("Student not found..");
                        }
                        break;
                    case 4://Remove Student Record
                        System.out.println("Please enter student Id you want to remove: ");
                        int removeId = input.nextInt();
                        if(studentAttendance.containsKey(removeId)){
                            studentAttendance.remove(removeId);
                            System.out.println("Student removed successfully..");
                        }else{
                            System.out.println("Student not found..");
                        }
                        break;
                    case 5://Display All Attendance Records
                        for(Map.Entry<Integer, Integer>entry:studentAttendance.entrySet()){
                            System.out.println("Student Id: "+entry.getKey()+" | and student attendance record: "+entry.getValue());
                        }
                        break;
                    case 6://Display Attendance Statistics
                        int totalStudents = studentAttendance.size();
                        if(totalStudents ==0){
                            System.out.println("No student registered!");
                            break;
                        }

                        //Displaying the statistics
                        int totalRecords = 0;
                        int highestRecord = -1;
                        int lowestRecord = Integer.MAX_VALUE;
                        int maxStudentAttendance = -1;
                        int minStudentAttendance = -1;
                        for(Map.Entry<Integer, Integer>entry:studentAttendance.entrySet()){
                            int studentIdKey = entry.getKey();
                            int studentRecords = entry.getValue();

                            totalRecords+= studentRecords;

                            if(studentRecords > highestRecord){
                                highestRecord = studentRecords;
                                maxStudentAttendance = studentIdKey;
                            }

                            if(studentRecords < lowestRecord){
                                lowestRecord = studentRecords;
                                minStudentAttendance = studentIdKey;
                            }
                        }
                        double average = (double) totalRecords / totalStudents;
                        System.out.println("Total number of students: "+totalStudents);
                        System.out.println("Total attendance days: "+totalRecords);
                        System.out.println("Average attendance"+average);
                        System.out.println("Student with the highest attendance: "+maxStudentAttendance);
                        System.out.println("Student with the lowest attendance: "+minStudentAttendance);
                        break;
                    case 7:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number entered");
                }
            }while (choice!=7);
        }
        input.close();
    }
}
