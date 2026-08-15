public class Main{
    public static void main(String[] args){
        PaymentInterface cash = new CashPayment();
        PaymentInterface card =  new CardPayment();
        PaymentInterface paypal = new PayPalPayment();

        PaymentInterface [] methods = {cash, card, paypal};

        for(PaymentInterface method : methods){
            System.out.println("The payment method is: "+method.addPaymentMethod());;
            System.out.println("The retry allowed: " + method.paymentRetry());;
            method.addDiscount();
        }
    }
}