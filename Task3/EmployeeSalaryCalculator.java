public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        // Declare variables and assign predefined values
        String employeeName = "Jokha";
        double basicSalary = 350;
        double bonusAmount = 200;
        double deductionAmount = 50;

        // Calculate the net salary
        double netSalary = calculateNetSalary(basicSalary,bonusAmount,deductionAmount);

        // Check the salary status
        String salaryStatus = checkSalaryStatus(netSalary);

        // Display all salary details
        displaySalaryDetails(employeeName, basicSalary, bonusAmount, deductionAmount, netSalary, salaryStatus);
    }

    //Create a method named calculateNetSalary()
    public static double calculateNetSalary(double basicSalary, double bonusAmount, double deductionAmount){
        return basicSalary + bonusAmount - deductionAmount;
    }

    //Create a method named checkSalaryStatus()
    public static String checkSalaryStatus(double netSalary){
        if(netSalary<500){
            return "Low Salary";
        } else if (netSalary>500 && netSalary<1500) {
            return  "Medium Salary";
        } else {
            return "High Salary";
        }
    }

    //Create a method named displaySalaryDetails()
    public static void displaySalaryDetails(String employeeName, double basicSalary, double bonusAmount, double deductionAmount, double netSalary, String salaryStatus){
        System.out.println("The employee name is: "+employeeName);
        System.out.println("The employee basic salary is: "+basicSalary);
        System.out.println("The employee bonus amount is: "+bonusAmount);
        System.out.println("The amount deduction from salary is: "+deductionAmount);
        System.out.println("The net salary is: "+netSalary);
        System.out.println("The salary status is: "+salaryStatus);
    }
}
