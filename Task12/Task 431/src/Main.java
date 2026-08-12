public void main() {
    Scanner sc = new Scanner(System.in);
    List<Payment> paymentList = new ArrayList<>();
    boolean exist = false;
    while (!exist) {
        IO.println("Please choose number from the list: ");
        IO.println("1. Add Card payment");
        IO.println("2. Add Cash Payment");
        IO.println("3. Add PayPal Payment");
        IO.println("4. Print all");
        IO.println("5. Exit");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: //1. Add Card payment
                cashDemo(paymentList);
                break;
            case 2: //2. Add Cash Payment
                cashDemo(paymentList);
                break;
            case 3: //3. Add PayPal Payment
               payPalDemo(paymentList);
                break;
            case 4: //4. Print all
                printAll(paymentList);
                break;
            case 5: //5. Exit
                exist = true;
                break;
            default:
                IO.println("Invalid number");
        }
    }

}

private static void cardDemo(List<Payment>list){
    Payment card = new CardPayment();
    card.process();
    list.add(card);
}

private static void cashDemo(List<Payment>list){
    Payment cash = new CashPayment();
    cash.process();
    list.add(cash);
}

private static void payPalDemo(List<Payment>list){
    Payment payPal = new CardPayment();
    payPal.process();
    list.add(payPal);
}

private static void printAll(List<Payment>list){
    if(list.isEmpty()){
        IO.println("No payments are stored!");
        return;
    }else{
        for(Payment p : list){
            p.process();
        }
    }
}