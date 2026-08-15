public class CashPayment extends Payment implements PaymentInterface{
    @Override
    public void process() {
        System.out.println("Processing from the Cash..");
    }

    @Override
    public boolean addPaymentMethod() {
        System.out.println("Cash payment is added successfully..");
        return true;
    }

    @Override
    public int paymentRetry() {
        return 3;
    }

    @Override
    public void addDiscount() {
        System.out.println("Cash payment discount: 0%");
    }
}
