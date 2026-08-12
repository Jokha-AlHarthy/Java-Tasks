public void main(){
    //Build one of each and call process() on all of them
    CashPayment cashPayment =  new CashPayment();
    cashPayment.process();

    CardPayment cardPayment = new CardPayment();
    cashPayment.process();

    PayPalPayment payPalPayment = new PayPalPayment();
    payPalPayment.process();
}