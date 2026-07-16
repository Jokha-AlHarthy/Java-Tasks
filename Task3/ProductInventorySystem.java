import java.util.ArrayList;

public class ProductInventorySystem {
    public static void main(String[] args){



        //Create lists to store data
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double>prices = new ArrayList<>();
        ArrayList<Integer>quantities = new ArrayList<>();

        //Use a loop to allow the user to enter information for 10 products
        int productCount = 0;
        while(productCount < 10){
            IO.println("Please enter product name: ");
            names.add(IO.readln());
            IO.println("Please enter product price: ");
            prices.add(Double.parseDouble(IO.readln()));
            IO.println("Please enter product quantity: ");
            quantities.add(Integer.parseInt(IO.readln()));
            productCount++;
        }

        //calling calculateTotalValue method
        double calculateTotalValue = calculateTotalValue(prices, quantities);

        //calling checkStockStatus method
        int[] countStockStatus = countStockStatus(quantities);
        int availableProducts = countStockStatus[0];
        int outOfStock = countStockStatus[1];

        //calling findMostExpensiveProduct method
        String findMostExpensiveProduct =  findMostExpensiveProduct(names, prices);

        //calling displayReport method
        displayReport(names, prices, quantities, calculateTotalValue, availableProducts, outOfStock, findMostExpensiveProduct);
    }

    //Create a method named calculateTotalValue()
    public static double calculateTotalValue(ArrayList<Double>prices, ArrayList<Integer>quantities){
        double total = 0;
        for(int i = 0; i < prices.size(); i++){
            total+= prices.get(i)*quantities.get(i);
        }
        return total;
    }

    //Create a method named checkStockStatus()
    public static String checkStockStatus(int quantity){
        if(quantity > 10){
            return "High Stock";
        }else if(quantity>=1){
            return "Available";
        }else{
            return "Out of Stock";
        }
    }

    //Create a method named countStockStatus()
    public static int[] countStockStatus(ArrayList<Integer> quantities){
        int availableProducts = 0;
        int outOfStock = 0;

        for (int quantity : quantities) {
            if (quantity > 0) {
                availableProducts++;
            } else {
                outOfStock++;
            }
        }

        return new int[]{availableProducts, outOfStock};
    }

    //Create a method named findMostExpensiveProduct()
    public static String findMostExpensiveProduct(ArrayList<String> names, ArrayList<Double>prices){
        int hightPrice = 0;
        for(int i = 1; i < prices.size(); i++){
            if(prices.get(i) > prices.get(hightPrice)){
                hightPrice = i;
            }
        }
        return names.get(hightPrice);
    }

    //Create a method named displayReport()
    public static void displayReport(ArrayList<String>names, ArrayList<Double>prices, ArrayList<Integer>quantities, double totalInventory, int availableProducts,int outOfStock, String mostExpensiveProduct){
        for(int i=0; i < names.size(); i++){
            System.out.println("Product name "+names.get(i));
            System.out.println("Product price "+prices.get(i));
            System.out.println("Stock of product status"+quantities.get(i));
        }

        System.out.println("Inventory Summary");
        System.out.println("Total inventory value: "+totalInventory);
        System.out.println("Number of available products: "+availableProducts);
        System.out.println("Number of out-of-stock products: "+outOfStock);
        System.out.println("Most expensive product: "+mostExpensiveProduct);
    }
}
