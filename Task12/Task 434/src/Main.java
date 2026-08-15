public class Main{
    public static void main(String[]args){
        Payment payment1 = new Payment("P101", 50.0, "Cash");
        payment1.printInfo();

        Payment payment2 = new Payment("P102", -20.0, "Card");
        payment2.printInfo();

        Payment payment3 = new Payment("P103", 100.0, "HackerType");
        payment3.printInfo();


        Payment payment4 = new Payment("P101", 75.0, "PayPal");
        payment4.printInfo();
    }

    /*
    * what went wrong is that users might enter negative number / wrong text / enter duplicate Id where this could lead to kill the system */
}