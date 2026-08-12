public void main(){
    // Take the amount from the user
    Scanner sc = new Scanner(System.in);

    Payment payment = new Payment();
    IO.println("Please enter the amount for payment: ");
    payment.setAmount(sc.nextDouble());
}