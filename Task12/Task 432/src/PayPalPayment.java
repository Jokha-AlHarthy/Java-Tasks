public class PayPalPayment extends Payment implements PaymentInterface{
    @Override
    public void process() {
        System.out.println("Processing from the PayPal..");
    }

    @Override
    public boolean addPaymentMethod() {
        System.out.println("PayPal account payment is added successfully..");
        return true;
    }

    @Override
    public int paymentRetry() {
        return 2;
    }

    @Override
    public void addDiscount() {
        System.out.println("PayPal payment discount: 10%");

    }
}
