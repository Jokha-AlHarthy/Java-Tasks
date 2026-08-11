public class Car {
    //Add attributes (qualities): String colour and String plate
    String colour;
    String plate;

    public void drive(){
        IO.println("Car "+plate + "with colour "+colour+" on drive mode..");
    }

    public void brake(){
        IO.println("Car " +plate + "with colour "+colour+" on brake mode..");
    }

    public static void main(String[] args){
        Car car = new Car();
        car.colour = "Beige";
        car.plate = "67637 R ";
        car.drive();
        car.brake();
    }
}
