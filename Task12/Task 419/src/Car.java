public class Car {
    //Add attributes (qualities): String colour and String plate
    String color;
    String plate;

    //Add behaviours (actions): drive() and brake(). Each one prints a short message
    public void drive(){
        IO.println("Car with " +color+ " and " + plate + "number on drive mode..");
    }

    public void brake(){
        IO.println("Car with " +color+ " and " + plate + "number on drive brake..");
    }
}
