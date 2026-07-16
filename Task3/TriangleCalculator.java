public class TriangleCalculator {
    public static void main(String[] args){

        //Declaring needed variables
        double base;
        double height;
        double length;
        double side1;
        double side2;
        double side3;
        double area = 0;
        double perimeter = 0;
        String triangleType;

        //Prompt the user to enter the radius using a Scanner
        IO.println("Please enter the value of base:");
        base = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of height:");
        height = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of length:");
        length = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of side1: ");
        side1 = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of side2:");
        side2 = Double.parseDouble(IO.readln());
        IO.println("Please enter the value of side3 :");
        side3 = Double.parseDouble(IO.readln());

        //Condition to check all values
        if(base <=0 || height <= 0 || length <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("Invalid input. All values must be greater than zero");
        } else {
            area = (base * height) / 2;
            perimeter = base + height + length;
        }

        if(side1 == side2 && side2 == side3){
            triangleType = "Equilateral Triangle";
        }else if (side1 == side2 || side1 == side3 || side2 == side3){
            triangleType ="Isosceles Triangle";
        } else {
            triangleType=  "Scalene Triangle";
        }

        //Display the base, height, side lengths, area, perimeter, and triangle type
        System.out.println("The base value is "+base);
        System.out.println("The height value is "+height);
        System.out.println("The length value is "+length);
        System.out.println("The area value is "+area);
        System.out.println("The perimeter value is "+perimeter);
        System.out.println("The triangle type is "+triangleType);
    }
}

