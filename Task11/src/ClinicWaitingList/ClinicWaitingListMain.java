package ClinicWaitingList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicWaitingListMain {
    static List<ATTENDABLE> queue = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    static void main(){
        IO.println("--- Single item created at startup ---");
        BookedPatient initialPatient = new BookedPatient("9:30");
        initialPatient.setName("Sarah Bennett");
        initialPatient.setAge(150);
        initialPatient.printAllInfo();
        queue.add(initialPatient);
        clinicInput();
    }

    public static void clinicInput(){
        Boolean exit = false;
        while(exit == false){
            IO.println("""
                    --- CLINIC MENU ---
                    1. Add booked
                    2. Add walk-in
                    3. Print queue
                    4. Longest wait
                    5. Exit
                    Choose:
                    """);
            Integer option = input.nextInt();
            if(option.equals(1)){
                queue.add(addBookedPatient());
            } else if (option.equals(2)) {
                queue.add(addWalkInVisitor());
            } else if (option.equals(3)) {
                int index = 1;
                for(ATTENDABLE patient: queue){
                    IO.println(index++ +". ");
                    patient.printAllInfo();
                }
            }else if(option.equals(4)) {
                if(queue.isEmpty()){
                    IO.println("Queue is empty");
                }else{
                    ATTENDABLE longest = queue.get(0);
                    for(ATTENDABLE patient: queue){
                        if(patient.getWaitMinutes() > longest.getWaitMinutes()){
                            longest = patient;
                        }
                    }
                    IO.println("Longest wait: "+longest.getName() + "("+longest.getWaitMinutes()+"min)");
                }
            } else if (option.equals(5)) {
                exit = true;
            }
        }
    }

    public static BookedPatient addBookedPatient(){
        IO.println("Enter slot time: ");
        String slot = input.next();
        BookedPatient bookedPatient = new BookedPatient(slot);
        IO.println("Enter name: ");
        bookedPatient.setName(input.next());
        IO.println("Enter age: ");
        bookedPatient.setAge(input.nextInt());
        IO.println("Enter arrival order: ");
        IO.println("Added");
        bookedPatient.printAllInfo();
        bookedPatient.getPriority();
        bookedPatient.getWaitMinutes();
        return bookedPatient;
    }

    public static WalkInVisitor addWalkInVisitor(){
        WalkInVisitor walkInVisitor = new WalkInVisitor();
        IO.println("Enter name: ");
        walkInVisitor.setName(input.next());
        IO.println("Enter age: ");
        walkInVisitor.setAge(input.nextInt());
        IO.println("Enter arrival Order: ");
        walkInVisitor.setArrivalOrder(input.nextInt());
        walkInVisitor.printAllInfo();
        walkInVisitor.getPriority();
        walkInVisitor.getWaitMinutes();
        return walkInVisitor;
    }
}
