import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SmartParkingGarage {
    public static void main(String[] args){
        //Queue<String> to store waiting vehicles
        Deque<String>waitingVehicles = new LinkedList<>();

        //Stack<String> to store parked vehicles
        Stack<String> parkedVehicles = new Stack<>();


        //Set the maximum parking capacity to 10 vehicles
        int maxParking = 10;

        //Every vehicle must have a unique license plate number
        int totalParked = 0;
        int totalWaiting = 0;

        //If the vehicle already exists, display an error message
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers of vehicle: ");
        int numOfVehicle = input.nextInt();
        if(waitingVehicles.contains(numOfVehicle) && parkedVehicles.contains(numOfVehicle)){
            System.out.println("The vehicle is already exist");
        }else{
            //Display the following menu continuously until the user selects Exit
            int choice;
            do{
                System.out.println("1. Add Vehicle to Waiting Queue");
                System.out.println("2. Park Next Vehicle");
                System.out.println("3. Remove Parked Vehicle");
                System.out.println("4. View Next Waiting Vehicle");
                System.out.println("5. View Last Parked Vehicle");
                System.out.println("6. Display Waiting Queue");
                System.out.println("7. Display Parked Vehicles");
                System.out.println("8. Search Vehicle");
                System.out.println("9. Display Garage Statistics");
                System.out.println("10. Clear Waiting Queue");
                System.out.println("11. Clear Parking Garage");
                System.out.println("12. Reset Entire System");
                System.out.println("13. Exit");

                System.out.println("Please choose one number from the list");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Option 1 – Add Vehicle
                        System.out.println("Please enter your vehicle number: ");
                        String plateNo = input.next();
                        if(waitingVehicles.contains(plateNo) || parkedVehicles.contains(plateNo)){
                            System.out.println("The queue is not empty");
                        }else{
                            System.out.println("The queue is empty");
                            waitingVehicles.add(plateNo);
                            System.out.println("Vehicle successfully added to the queue");
                        }
                        break;
                    case 2: //Option 2 – Park Next Vehicle
                        if(waitingVehicles.isEmpty()){
                            System.out.println("The waiting queue is empty");
                        }else if(parkedVehicles.size() >= maxParking){
                            System.out.println("The garage is already full");
                        }else{
                            //Remove the first vehicle from the waiting queue
                            String removeVehicle = waitingVehicles.poll();
                            parkedVehicles.push(removeVehicle);
                            totalParked++;
                            System.out.println("The vehicle parked successfully..");
                        }
                        break;
                    case 3: //Option 3 – Remove Parked Vehicle
                        if(parkedVehicles.isEmpty()){
                            System.out.println("No vehicles are parked");
                        }else{
                            String parkedVehicle = parkedVehicles.pop();
                            totalWaiting++;
                            System.out.println(parkedVehicle+" vehicle removed from parking successfully..");
                        }
                        //automatically park the next waiting vehicle.
                        if(!waitingVehicles.isEmpty()){
                            String parking = waitingVehicles.poll();
                            parkedVehicles.push(parking);
                            totalParked++;
                            System.out.println("The vehicle parked for the next waiting vehicle successfully..");
                        }
                        break;
                    case 4: //Option 4 – View Next Waiting Vehicle
                        if(waitingVehicles.isEmpty()){
                            System.out.println("No vehicles are waiting");
                        }else{
                            System.out.println("Next waiting vehicle: "+waitingVehicles.peek());
                        }
                        break;
                    case 5: //Option 5 – View Last Parked Vehicle
                        if(parkedVehicles.isEmpty()){
                            System.out.println("No vehicles are parked");
                        }else{
                            System.out.println("Last parked vehicle: "+parkedVehicles.peek());
                        }
                        break;
                    case 6: //Option 6 – Display Waiting Queue
                        if(waitingVehicles.isEmpty()){
                            System.out.println("No vehicles are waiting");
                        }else{
                            int index = 1;
                            for(String car : waitingVehicles){
                                System.out.println(index+". "+car);
                                index++;
                            }
                            System.out.println("Total waiting vehicles: "+waitingVehicles.size());
                        }
                        break;
                    case 7: //Option 7 – Display Parked Vehicles
                        int occupied = parkedVehicles.size();
                        int avilable = maxParking - occupied;
                        if(parkedVehicles.isEmpty()){
                            System.out.println("No vehicles are parked");
                        }else {
                            Stack<String>tempStack = new Stack<>();
                            while (!parkedVehicles.isEmpty()){
                                String vehicle = parkedVehicles.pop();
                                System.out.println(vehicle);
                                tempStack.push(vehicle);
                            }

                            while (!tempStack.isEmpty()){
                                parkedVehicles.push(tempStack.pop());
                            }
                            System.out.println("Garage Capacity :"+maxParking);
                            System.out.println("Occupied Spaces :"+occupied);
                            System.out.println("Available Spaces : "+avilable);
                        }
                        break;
                    case 8: //Option 8 – Search Vehicle
                        if(waitingVehicles.isEmpty() && parkedVehicles.isEmpty()){
                            System.out.println("No vehicles are waiting & No vehicles are parked");
                        }else{
                            System.out.println("please enter number of vehicle you want to search for: ");
                            String search = input.next();
                            if(waitingVehicles.contains(search)){
                                System.out.println("The vehicle is in the waiting vehicles");
                            }else if (parkedVehicles.contains(search)){
                                System.out.println("The vehicle is in the parked vehicles");
                            }else{
                                System.out.println("The vehicle is not found..");
                            }
                        }
                        break;
                    case 9: //Option 9 – Display Garage Statistics
                        int currentParked = parkedVehicles.size();
                        int remainingSpaces = maxParking - currentParked;
                        int totalProcess = totalParked + totalWaiting;
                        double occupancy = ((double) currentParked / maxParking) * 100;
                        System.out.println("Maximum Capacity:"+maxParking);
                        System.out.println("Currently Parked: "+currentParked);
                        System.out.println("Waiting Vehicles: "+waitingVehicles.size());
                        System.out.println("Available Spaces: "+remainingSpaces);
                        System.out.println("Vehicles Parked Today: "+totalParked);
                        System.out.println("Vehicles Departed Today: "+totalWaiting);
                        System.out.println("Total Vehicles Processed: "+totalProcess);
                        System.out.println("Occupancy: "+occupancy+"%");
                        break;
                    case 10: //Option 10 – Clear Waiting Queue
                        if(waitingVehicles.isEmpty()){
                            System.out.println("No vehicles are waiting");
                        }else {
                            System.out.println("Are sure you want to clear waiting vehicle? (Yes/ No)");
                            String confirm = input.next();
                            if(confirm.equals("Yes")){
                                waitingVehicles.clear();
                                System.out.println("Waiting vehicle cleared successfully..");
                            }else{
                                System.out.println("Cancel the clearing process");
                            }
                        }
                        break;
                    case 11: //Option 11 – Clear Parking Garage
                        if(parkedVehicles.isEmpty()){
                            System.out.println("No vehicles are parked");
                        }else{
                            System.out.println("Are sure you want to remove all the vehicles? (Yes / No)");
                            String confirm = input.next();
                            if(confirm.equals("Yes")){
                                parkedVehicles.clear();
                                System.out.println("Parking vehicle cleared successfully..");
                            }else{
                                System.out.println("Cancel the clearing process");
                            }

                        }
                        break;
                    case 12: //Option 12 – Reset Entire System
                        System.out.println("Are sure you want to reset the entire system? (Yes/ No)");
                        String confirm = input.next();
                        if(confirm.equals("Yes")){
                            waitingVehicles.clear();
                            parkedVehicles.clear();
                            totalParked= 0;
                            totalWaiting = 0;
                            System.out.println("System reset sccuessfully..");
                        }else{
                            System.out.println("Cancel the resting process");
                        }
                        break;
                    case 13: //Option 13 – Exit
                        System.out.println("Thank you for using Smart Parking Garage");
                        break;
                    default:
                        System.out.println("Invalid number entered!");
                }
            }while(choice!=13);
        }
        input.close();
    }
}