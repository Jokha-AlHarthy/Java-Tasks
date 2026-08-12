public class CardPayment extends Payment{
    // override process() so it prints a different message

    @Override
    public void process() {
        IO.println("Processing from the card..");
    }
}
