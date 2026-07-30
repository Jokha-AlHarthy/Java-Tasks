import java.util.*;

public class HospitalPatientManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create the following data structures Queue<String> using LinkedList to store Patient names waiting for treatment
        Queue<String> patientNames = new LinkedList<>();

        //Create the following data structures Stack<String> to store Completed patient treatments
        Deque<String> completedPatient = new ArrayDeque<>();

        //Prompt the user to enter the number of patients waiting using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of patients: ");
        int numOfPatients = input.nextInt();

        //checking If the entered number is less than or equal to 0
        if(numOfPatients<=0){
            System.out.println("Invalid number of patients");
        }else{
            //Use a for loop to read each patient name
            for(int i=0; i<numOfPatients; i++){
                System.out.println("Please enter name of the patient: ");
                String patient = input.next();
                patientNames.offer(patient);
            }

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Patient");
                System.out.println("2. Treat Patient");
                System.out.println("3. View Next Patient");
                System.out.println("4. Undo Last Treatment");
                System.out.println("5. Search Patient");
                System.out.println("6. Display Waiting Patients");
                System.out.println("7. Display Treated Patients");
                System.out.println("8. Display Hospital Statistics");
                System.out.println("9. Exit");

                System.out.println("Please choose number from the list: ");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Add Patient
                        System.out.println("Please enter patient name: ");
                        String name = input.next();
                        patientNames.offer(name);
                        System.out.println("Patient added successfully");
                        break;
                    case 2: //Treat Patient
                        if(patientNames.isEmpty()){
                            System.out.println("No patients waiting for treatment");
                        }else{
                            String treatPatient = patientNames.poll();
                            completedPatient.push(treatPatient);
                            System.out.println("Patient treatment completed successfully..");
                        }
                        break;
                    case 3: //View Next Patient
                        if(patientNames.isEmpty()){
                            System.out.println("No patients available");
                        }else{
                            System.out.println("Display the next patient: "+patientNames.peek());
                        }
                        break;
                    case 4: //Undo Last Treatment
                        if(completedPatient.isEmpty()){
                            System.out.println("No completed treatments available");
                        }else{
                            System.out.println("Remove the last treated patient: "+completedPatient.pop());
                        }
                        break;
                    case 5: //Search Patient
                        System.out.println("Enter name of patient you want to search for: ");
                        String searchName = input.next();
                        if(patientNames.contains(searchName)){
                            System.out.println("Patient is waiting for treatment");
                        } else if (completedPatient.contains(searchName)) {
                            System.out.println("Patient treatment completed");
                        }else {
                            System.out.println("Patient not found");
                        }
                        break;
                    case 6: //Display Waiting Patients
                        if(patientNames.isEmpty()){
                            System.out.println("No waiting patients");
                        }else{
                            for(String patient : patientNames){
                                System.out.println("Display all patients: "+patient);
                            }
                        }
                        break;
                    case 7: //Display Treated Patients
                        if(completedPatient.isEmpty()){
                            System.out.println("No treated patients");
                        }else {
                            for(String patient : completedPatient){
                                System.out.println("Display all completed: "+patient);
                            }
                        }
                        break;
                    case 8: //Display Hospital Statistics
                        System.out.println("Total waiting patients: "+patientNames.size());
                        System.out.println("Total treated patients: "+completedPatient.size());
                        System.out.println("Next patient waiting: "+patientNames.peek());
                        System.out.println("Last treated patient: "+completedPatient.peek());
                        System.out.println("Check if the queue is empty: "+patientNames.isEmpty());
                        System.out.println("Check if the stack is empty: "+completedPatient.isEmpty());
                        break;
                    case 9: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number");
                }
            }while (choice!= 9);
        }
        input.close();
    }
}
