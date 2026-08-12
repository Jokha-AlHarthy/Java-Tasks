public void main(){
    //Add a CashPayment, a CardPayment, and a PayPalPayment into that one list
    List<Payment>listOfPayment =  new ArrayList<>();
    listOfPayment.add(new PayPalPayment());
    listOfPayment.add(new CardPayment());
    listOfPayment.add(new CashPayment());

    for(Payment pay : listOfPayment){
        pay.process();
    }
}