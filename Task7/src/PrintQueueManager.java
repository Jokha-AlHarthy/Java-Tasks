import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintQueueManager {
    //Create the main method inside the class
    public static void main(String[] args){

        //Create a Queue<String> using LinkedList to store print job name
        Queue<String>jobNames = new LinkedList<>();

        //Ask user to enter the number of print jobs using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of job name: ");
        int numOfJobName = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if(numOfJobName<=0){
            System.out.println("Invalid number of print jobs");
        }else{
            //Use a for loop to read each print job name
            for(int i=0; i<numOfJobName; i++){
                System.out.println("Enter job name: ");
                String job = input.next();
                jobNames.offer(job);
            }

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Print Job ");
                System.out.println("2. Process Next Print Job");
                System.out.println("3. View Next Print Job");
                System.out.println("4. Search Print Job");
                System.out.println("5. Remove Print Job");
                System.out.println("6. Display All Print Jobs");
                System.out.println("7. Display Queue Statistics");
                System.out.println("8. Exit");

                System.out.println("Please choose number from the list: ");
                choice = input.nextInt();

                switch (choice){
                    case 1://Add Print Job
                        System.out.println("Please enter job name you want to print: ");
                        String newJob = input.next();
                        jobNames.offer(newJob);
                        System.out.println("Print job added successfully");
                        break;

                    case 2: //Process Next Print Job
                        if(jobNames.isEmpty()){
                            System.out.println("No print jobs in the queue");
                        }else{
                            System.out.println("Display the processed print job: "+jobNames.poll());
                        }
                        break;

                    case 3: //View Next Print Job
                        if(jobNames.isEmpty()){
                            System.out.println("No print jobs in the queue");
                        }else{
                            System.out.println("Display the next print job: "+jobNames.peek());
                        }
                        break;
                    case 4: //Search Print Job
                        System.out.println("Please print your job name: ");
                        String searchJob = input.next();
                        if(jobNames.contains(searchJob)){
                            System.out.println("Printed job found");
                        }else{
                            System.out.println("Sorry, your print job name is not found..");
                        }
                        break;
                    case 5: //Remove Print Job
                        System.out.println("Enter name of printed job you want to remove: ");
                        String removeJob = input.next();
                        if(jobNames.remove(removeJob)){
                            System.out.println("Job print removed successfully");
                        }else{
                            System.out.println("Print job not found");
                        }
                        break;
                    case 6: //Display All Print Jobs
                        if(jobNames.isEmpty()){
                            System.out.println("No print jobs in the queue");
                        }else{
                            for(String job: jobNames){
                                System.out.println("Displaying print job names: "+job);
                            }
                        }
                        break;
                    case 7: //Display Queue Statistics
                        System.out.println("Total number of print jobs: "+jobNames.size());
                        System.out.println("Next print job: "+jobNames.peek());
                        System.out.println("Whether the queue is empty: "+jobNames.isEmpty());
                        break;
                    case 8: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid number!");
                }

            }while(choice!= 8);
        }
        input.close();
    }
}
