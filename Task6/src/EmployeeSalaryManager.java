import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a HashMap<Integer, Double> to store Employee ID as the key & Employee salary as the value
        HashMap<Integer, Double> empIdSalary = new HashMap<>();

        //Ask user to enter the number of employees
        IO.println("Please enter number of employee: ");
        int NumOfEmployee = Integer.parseInt(IO.readln());

        //Checking If the entered number is less than or equal to 0
        if(NumOfEmployee<=0){
            IO.println("Invalid number of employees");
        }else{
            //Use a for loop to read each employee ID and salary
            for(int i=0; i<NumOfEmployee; i++){
                //Enter employee Id
                IO.println("Please enter employee Id: ");
                int empId = Integer.parseInt(IO.readln());

                IO.println("Please enter the salary of the employee: ");
                double salary = Double.parseDouble(IO.readln());

                //checking If it exists
                if(empIdSalary.containsKey(empId)){
                    IO.println("Employee ID already exists. Record not added");
                }else{
                    //store the employee in the HashMap
                    empIdSalary.put(empId, salary);
                }
            }

            //Display a menu that repeats until the user chooses to exit
            int choice = 0;
            while(choice!=7){
                IO.println("1. Add Employee");
                IO.println("2. Search Employee");
                IO.println("3. Update Salary");
                IO.println("4. Remove Employee");
                IO.println("5. Display All Employees");
                IO.println("6. Display Salary Statistics");
                IO.println("7. Exit");

                IO.println("Please choose an of the choice: ");
                choice = Integer.parseInt(IO.readln());

                switch (choice){
                    case 1: //Add Employee
                        IO.println("Enter employee Id you want to search for: ");
                        int addEmpId = Integer.parseInt(IO.readln());

                        //Checking if the employee found or not
                        if(empIdSalary.containsKey(addEmpId)){
                            IO.println("Employee Id already exists!");
                        }else{
                            IO.println("Please enter the salary for the new employee: ");
                            double addEmpSalary = Double.parseDouble(IO.readln());
                            empIdSalary.put(addEmpId, addEmpSalary);
                            IO.println("Employee added successfully");
                        }
                        break;
                    case 2://Search Employee
                        IO.println("Enter employee Id you want to search for: ");
                        int searchId = Integer.parseInt(IO.readln());
                        if(empIdSalary.containsKey(searchId)){
                            //Display the Id and salary of the employee
                            IO.println(empIdSalary.get(searchId));
                        }else{
                            //Otherwise display
                            IO.println("Employee not found..");
                        }
                        break;
                    case 3://Update Salary
                        //Checking if the employee exists
                        IO.println("Please enter employee Id you want to search for: ");
                        int searchEmpId = Integer.parseInt(IO.readln());
                        if(empIdSalary.containsKey(searchEmpId)){
                            //Ask user to enter the new salary of the employee
                            IO.println("Please enter the new salary of the employee");
                            double newSalary = Double.parseDouble(IO.readln());
                            empIdSalary.replace(searchEmpId, newSalary);
                            IO.println("Employee salary updated successfully");
                        }else{
                            IO.println("Employee not found..");
                        }
                        break;
                    case 4: //Remove Employee
                        IO.println("Enter employee Id you want to remove: ");
                        int removeId = Integer.parseInt(IO.readln());
                        if(empIdSalary.containsKey(removeId)){
                           empIdSalary.remove(removeId);
                           IO.println("Employee removed successfully..");
                        }else{
                            IO.println("Employee not found..");
                        }
                        break;
                    case 5://Display All Employees
                        for(Map.Entry<Integer, Double> entry: empIdSalary.entrySet()){
                            IO.println("Employee Id: "+entry.getKey() + " | Salary: "+entry.getValue());
                        }
                        break;
                    case 6: //Display Salary Statistics
                        int totalEmployee = empIdSalary.size();
                        if(totalEmployee == 0){
                            IO.println("No Employee registered!");
                            break;
                        }

                        //Display
                        double totalSalaries = 0;
                        double highestSalary = -1;
                        double lowestSalary = Integer.MAX_VALUE;
                        int maxEmployeeId = -1;
                        int minEmployeeId = -1;
                        for(Map.Entry<Integer, Double>entry : empIdSalary.entrySet()){
                            int employeeIdKey = entry.getKey();
                            double employeeSalary = entry.getValue();

                            totalSalaries+= employeeSalary;

                            if(employeeSalary > highestSalary){
                                highestSalary = employeeSalary;
                                maxEmployeeId = employeeIdKey;
                            }

                            if(employeeSalary<lowestSalary){
                                lowestSalary = employeeSalary;
                                minEmployeeId = employeeIdKey;
                            }
                        }
                        double average = (double) totalSalaries / totalEmployee;
                        System.out.println("Highest salary: "+highestSalary + " | Employee Id: "+maxEmployeeId);
                        System.out.println("Lowest salary: "+lowestSalary+ " | Employee Id: "+minEmployeeId);
                        System.out.println("Average salary: "+average);
                        System.out.println("Total payroll: "+totalSalaries);
                        break;
                    case 7:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number entered");
                }
            }
        }
    }
}
