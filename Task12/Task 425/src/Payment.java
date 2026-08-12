import java.util.Scanner;

//Make a Payment class with a private amount
public class Payment {
    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if(amount > 0){
            this.amount = amount;
            IO.println("The amount for the payment is: "+amount);
        }else{
            IO.println("The amount should be greater than 0");
        }
    }
}
