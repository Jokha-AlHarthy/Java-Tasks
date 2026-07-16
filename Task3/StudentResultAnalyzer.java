public class StudentResultAnalyzer {
    public static void main(String[] args){

        // Declare variables and assign predefined values
        String studentId = "16J21139";
        String studentName = "Jokha";
        String subject = "Introduction to Java";
        double markSubject1 = 85;
        double markSubject2 = 78;
        double markSubject3 = 99;

        //validate the student marks
        boolean validateMarks = validateMarks(markSubject1, markSubject2, markSubject3);
        if(!validateMarks){
            System.out.println("Invalid marks. Please check the student grades");
        }else {
            //calling totalMarks method
            double totalMarks = calculateTotal(markSubject1, markSubject2, markSubject3);

            //calling averageMark method
            double averageMark = calculateAverage(totalMarks, 3);

            //calling finalGrade method
            String finalGrade = calculateGrade(averageMark);

            //calling performanceStatus method
            String performanceStatus = checkPerformance(finalGrade);

            //calling displayReport
            displayReport(studentId, studentName, subject, markSubject1, markSubject2, markSubject3, totalMarks, averageMark, finalGrade, performanceStatus);
        }

    }

    //Create a method named validateMarks()
    public static boolean validateMarks(double markSubject1, double markSubject2, double markSubject3) {
        return markSubject1 >= 0 && markSubject1 <= 100 && markSubject2 >= 0 && markSubject2 <= 100 && markSubject3 >= 0 && markSubject3 <= 100;
    }

    //Create a method named calculateAverage()
    public static double calculateAverage(double totalMarks, int numberOfSubjects) {
        return totalMarks / numberOfSubjects;
    }

    //Create a method named calculateTotal()
    public static double calculateTotal(double markSubject1, double markSubject2, double markSubject3
    ) {
        return markSubject1 + markSubject2 + markSubject3;
    }

    //Create a method named calculateGrade()
    public static String calculateGrade(double averageMark) {
        if (averageMark >= 90) {
            return "A";
        } else if (averageMark >= 80) {
            return "B";
        } else if (averageMark >= 70) {
            return "C";
        } else if (averageMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //Create a method named checkPerformance()
    public static String checkPerformance(String grade) {
        if (grade.equals("A")) {
            return "Excellent performance";
        } else if (grade.equals("B")) {
            return "Good performance";
        } else if (grade.equals("C")) {
            return "Average performance";
        } else if (grade.equals("D")) {
            return "Needs improvement";
        } else {
            return "Poor performance";
        }
    }

    //Create a method named displayReport()
    public static void displayReport(String studentId, String studentName, String subject, double markSubject1, double markSubject2, double markSubject3, double totalMarks, double averageMark, String finalGrade, String performanceStatus) {
        System.out.println("The report of student");
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject: " + subject);
        System.out.println("Subject 1 mark: " + markSubject1);
        System.out.println("Subject 2 mark: " + markSubject2);
        System.out.println("Subject 3 mark: " + markSubject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Performance Status: " + performanceStatus);
    }
}
