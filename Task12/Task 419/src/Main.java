public void main(){
    Scanner sc =  new Scanner(System.in);
    Car car =  new Car();
    IO.println("Enter car colour");
    car.color = sc.nextLine();

    IO.println("Enter plate:");
    car.plate = sc.nextLine();

    car.brake();
    car.drive();
}