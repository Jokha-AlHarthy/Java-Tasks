import java.util.HashSet;
import java.util.Set;

public class Payment {
    private static Set<String> userIds = new HashSet<>();

    private final String id;
    private double amount;
    private String type;

    public Payment(String id, double amount, String cash) {
        if(userIds.contains(id)){
            System.out.println(id+"Id is already taken");
            this.id = "Invalid Id";
        }else{
            this.id = id;
            userIds.add(id);
        }
        setAmount(amount);
        setType(type);

    }

    public void setAmount(double amount) {
        if(amount>0){
            this.amount = amount;
        }
        System.out.println("The amount less than 0 should be greater");
        this.amount = 0;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("Cash") || type.equalsIgnoreCase("Card")|| type.equalsIgnoreCase("PayPal" )){
            this.type = type;
        }else{
            System.out.println("Payment rejected");
        }
    }

    public void printInfo(){
        System.out.println("Payment{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}');
    }
}
