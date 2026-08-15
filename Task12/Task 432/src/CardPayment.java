public class CardPayment extends Payment implements PaymentInterface{
    @Override
    public void process() {
        System.out.println("Processing from the card..");
    }

    @Override
    public boolean addPaymentMethod() {
        System.out.println("Credit/Debit Card payment is added successfully..");
        return true;
    }

    @Override
    public int paymentRetry() {
        return 5;
    }

    @Override
    public void addDiscount() {
        System.out.println("Card payment discount: 5%");
    }
}