import java.util.HashMap;

public class EmployeeDirectoryMap {
    //Create the main method inside the class
    public static void main(String[] args){
        // Create a HashMap<Integer, String> to store employee IDs as keys and employee names as values
        HashMap<Integer, String> employeeId = new HashMap<>();

        //Ask the user to enter the number of employees
        IO.println("Enter number of employees: ");
        int NumOfEmployees = Integer.parseInt(IO.readln());

        //checking If the entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfEmployees<=0){
            IO.println("Invalid number of employees");
        }else {
            //Use a for loop to read each employee ID and employee name
            for(int i = 0; i<NumOfEmployees; i++) {
                //Asking the user to enter employee Id & employee name
                IO.println("Enter employee Id: ");
                int empId = Integer.parseInt(IO.readln());
                IO.println("Enter employee name: ");
                String empName = IO.readln();
                totalEntered++;

                //check whether the ID already exists in the HashMap
                if (employeeId.containsKey(empId)) {
                    IO.println("Employee ID already exists. Please enter a unique ID");
                } else {
                    employeeId.put(empId, empName);
                }
            }
            //checking if the employee id exists
            IO.println("Enter employee Id you want to search for: ");
            int searchId = Integer.parseInt(IO.readln());
            String searchResult;
            if (employeeId.containsKey(searchId)) {
                searchResult = "Employee Found: [" + employeeId.get(searchId) + "]";
            } else {
                searchResult = "Employee ID not found";
            }


            //Use an if-else statement to classify the company
            String classification;
            if(employeeId.size()<5){
                classification = "Small Company";
            } else if (employeeId.size()>=5 && employeeId.size()<=10) {
                classification="Medium Company";
            }else {
                classification="Large Company";
            }

            //Display the following using System.out.println()
            System.out.println("Total employee records entered: "+totalEntered);
            System.out.println("Total unique employees: "+employeeId.size());
            System.out.println("All employee IDs and names: "+employeeId);
            System.out.println("Search result: "+searchResult);
            System.out.println("Company classification: "+classification);
        }
    }
}
