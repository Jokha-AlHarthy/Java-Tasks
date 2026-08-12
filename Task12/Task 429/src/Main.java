public void main(){
    //Build one of each and call process() on all of them
    CashPayment cashPayment =  new CashPayment();
    cashPayment.process();
    cashPayment.accept(9000000000000000000L);
    cashPayment.accept("350 OMR");
    cashPayment.accept(30);
    IO.println("\n");

    CardPayment cardPayment = new CardPayment();
    cardPayment.process();

    PayPalPayment payPalPayment = new PayPalPayment();
    payPalPayment.process();




}