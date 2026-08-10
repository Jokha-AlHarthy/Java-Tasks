package GymMembershipDesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymMembershipDeskMain {
    /*
     * Abstraction: it's located in the implemented interfaces and abstract methods that hides complex implementation details
     * Encapsulation : it's located within the private class and public methods that control the access of them
     * */
    static List<Payable> gym= new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void main(){
        IO.println("---Single Gym details created for a member---");
        MonthlyMember member =  new MonthlyMember(15086167);
        member.setMemberName("Jokha Hamed");
        member.setAge(24);
        member.setMonthlyFee(25);
        gym.add(member);
        member.printAllInfo();
        gymInput();
    }

    public static void gymInput(){
        Boolean exit = false;
        while(exit==false) {
            IO.println("""
                    1. Add a monthly member
                    2. Add a day-pass visitor
                    3. Print all members
                    4. Show total monthly income
                    5. Search a member by name
                    6. Exit
                    Choose:
                    """);
            Integer option = input.nextInt();
            if(option.equals(1)){
                gym.add(addMonthlyMember());
            } else if (option.equals(2)) {
                gym.add(addDayPass());
            } else if (option.equals(3)) {
                int index = 1;
                for(Payable GymMembers : gym){
                    IO.println(index++ +". ");
                    GymMembers.printAllInfo();
                }
            } else if (option.equals(4)) {
                int total = 0;
                for(Payable totalPay : gym){
                    total+= totalPay.monthlyTotal();
                }
                IO.println("The total monlty income is:"+ total);
            } else if (option.equals(5)) {
                IO.println("Enter name you want search for: ");
                String searchName = IO.readln();
                boolean found = false;
                for(Payable name:gym){
                   if(name.getName() != null && name.getName().trim().equalsIgnoreCase(searchName.trim())){
                       IO.println("Member found: ");
                       name.printAllInfo();
                       found = true;
                       break;
                   }
                }
                if(found == false){
                    IO.println("Member not found "+searchName);
                }
            }else if(option.equals(6)){
                exit = true;
            }
        }
    }

    public static MonthlyMember addMonthlyMember(){
        IO.println("Please enter your member Id: ");
        Integer Id = input.nextInt();
        MonthlyMember monthlyMember = new MonthlyMember(Id);
        IO.println("Please enter your name: ");
        monthlyMember.setMemberName(input.next());
        IO.println("Please enter your age: ");
        monthlyMember.setAge(input.nextInt());
        IO.println("Please enter the monthly fee: ");
        monthlyMember.setMonthlyFee(input.nextInt());
        monthlyMember.printAllInfo();
        return monthlyMember;
    }

    public static DayPassVisitor addDayPass(){
        IO.println("Please enter the price visit per day: ");
        Integer pricePerVisit = input.nextInt();
        IO.println("Please enter your member Id: ");
        Integer Id = input.nextInt();
        DayPassVisitor dayPassVisitor = new DayPassVisitor(Id);
        IO.println("Please enter your name: ");
        dayPassVisitor.setMemberName(input.next());
        IO.println("Please enter your age: ");
        dayPassVisitor.setAge(input.nextInt());
        IO.println("Please enter number of day visit: ");
        dayPassVisitor.setNumberOfVisit(input.nextInt());
        dayPassVisitor.printAllInfo();
        return dayPassVisitor;
    }
}
