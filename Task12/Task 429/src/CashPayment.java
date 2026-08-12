public class CashPayment extends Payment{
// override process() so it prints a different message

    @Override
    public void process() {
        IO.println("Processing from the Cash..");
    }

    //write three methods all called accept
    public void accept(String cashAmount){
        IO.println("cashAmount: "+cashAmount);
    }

    public void accept(long chequeNumber){
        IO.println("chequeNumber: "+chequeNumber);
    }

    public void accept(int payOrder){
        IO.println("payOrder: "+payOrder);
    }


}