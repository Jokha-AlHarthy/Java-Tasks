public class TrapezoidCalculator {
    public static void main(String[] args){
        //Declaring needed variables
        double base1;
        double base2;
        double height;
        double leg1;
        double leg2;
        double area = 0;
        double perimeter = 0;
        String Trapezoid;

        //Prompt the user to enter the values using a Scanner
        IO.println("Please enter the value of base 1:");
        base1 = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of base 2:");
        base2 = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of height:");
        height = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of leg1:");
        leg1 = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of leg2:");
        leg2 = Double.parseDouble(IO.readln());


        //Checking the condition
        if(base1 > 0 && base2 > 0 && height > 0 && leg1 > 0 && leg2 > 0){
            System.out.println("Vaild input. All measurements are greater than zero ");
        }else if(base1 <= 0 || base2 <= 0 || height <= 0 || leg1 <= 0 || leg2 <= 0){
            System.out.println("Invalid input. All measurements must be greater than zero");
        }else{
            area = ((base1 + base2) * height) / 2;
            perimeter= base1 + base2 + leg1 + leg2;
        }

        if(perimeter < 30){
            Trapezoid = " Small Trapezoid";
        }else if(perimeter > 30 && perimeter<=60){
            Trapezoid = "Medium Trapezoid";
        }else{
            Trapezoid = "Large Trapezoid";
        }

        //Display all input values and the calculated values along with classification
        System.out.println("The value of base1: "+base1);
        System.out.println("The value of base2: "+base2);
        System.out.println("The value of leg1: "+leg1);
        System.out.println("The value of leg2: "+leg2);
        System.out.println("The value of height: "+height);
        System.out.println("The value of area: "+area);
        System.out.println("The value of perimeter: "+perimeter);
        System.out.println("The trapezoid classification: "+Trapezoid);
    }
}
