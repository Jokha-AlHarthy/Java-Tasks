package VehicleRentalDesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* Abstraction: it's located in the implemented interfaces and abstract methods that hides complex implementation details
* Encapsulation : it's located within the private class and public methods that control the access of them
* */

public class VehicleRentalDeskMain {
    static List<Rentable> rent = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void main(){
        IO.println("---Single vehicle created at startup---");
        Car initailCar = new Car();
        initailCar.setPlateNumber("67637 R");
        initailCar.setDailyRate(30);
        initailCar.setNumberOfSeats(5);
        initailCar.setNumberOfRentalDays(15);
        rent.add(initailCar);
        initailCar.printAllInfo();
        rentalInput();
    }

    public static void rentalInput(){
        Boolean exit = false;
        while(exit==false){
            IO.println("""
                    1. Add a car
                    2. Add a motorbike
                    3. Print everything on hire
                    4. Show total income
                    5. Exit
                    Choose:
                    """);
            Integer option = input.nextInt();
            if(option.equals(1)){
                rent.add(addCar());
            } else if (option.equals(2)) {
                rent.add(addMotorbike());
            }else if(option.equals(3)){
                int index = 1;
                for(Rentable v : rent){
                    IO.println(index++ +". ");
                    v.printAllInfo();
                }
            } else if (option.equals(4)) {
                int total = 0;
                for(Rentable v: rent){
                    total+=v.costForDays(v.getNumberOfRentalDays());
                }
                IO.println("The total income is: "+total);
            } else if (option.equals(5)) {
                exit = true;
            }

        }
    }

    public static Car addCar(){
        Car car =  new Car();
        IO.println("Enter car plate number: ");
        car.setPlateNumber(IO.readln());
        IO.println("Enter car daily rate: ");
        car.setDailyRate(input.nextInt());
        IO.println("Enter number of rental days of the car");
        car.setNumberOfRentalDays(input.nextInt());
        IO.println("Enter number of seats car: ");
        car.setNumberOfSeats(input.nextInt());
        IO.println("Added...");
        car.printAllInfo();
        return car;
    }

    public static Motorbike addMotorbike(){
        IO.println("Please enter your plate number");
        String numberPlate = IO.readln();
        Motorbike motorbike =  new Motorbike(numberPlate);
        IO.println("Enter motorbike daily rate: ");
        motorbike.setDailyRate(input.nextInt());
        IO.println("Enter number of rental days of the motorbike: ");
        motorbike.setNumOfrentalDays(input.nextInt());
        IO.println("Enter number of the engine size: ");
        motorbike.setEngineSize(input.nextInt());
        motorbike.printAllInfo();
        return motorbike;
    }



}
