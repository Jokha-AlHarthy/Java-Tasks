import java.util.HashMap;

public class ProductPriceCatalog {
    //Create the main method inside the class
    public static void main(String[] args) {
        //Create a HashMap<String, Double> to store product names as keys and product prices as values
        HashMap<String, Double> products = new HashMap<>();

        //Asking user to enter the number of products
        IO.println("Enter number of products: ");
        int NumOfProduct = Integer.parseInt(IO.readln());

        //checking If the entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfProduct<=0){
            IO.println("Invalid number of products");
        }else{
            //Use a for loop to read each product name and price
            for(int i = 0; i<NumOfProduct; i++){
                IO.println("Enter product name: ");
                String productName = IO.readln();

                IO.println("Enter product prices: ");
                double productPrice = Double.parseDouble(IO.readln());

                totalEntered++;

                //check whether the product name already exists
                if(products.containsKey(productName)){
                    IO.println("Product already exists. Record not added");
                }else{
                    //add the product and its price to the map
                    products.put(productName, productPrice);
                }
            }

            //If the product exists
            IO.println("Enter product name to search for: ");
            String searchName = IO.readln();

            String result;
            if (products.containsKey(searchName)) {
                IO.println("Current price: " + products.get(searchName));
                IO.println("Do you want to update the price (Y/N)? ");
                String response = IO.readln();

                if (response.equalsIgnoreCase("Y")) {
                    IO.println("Enter new price: ");
                    double newPrice = Double.parseDouble(IO.readln());
                    products.replace(searchName, newPrice);
                    result = "Price updated successfully";
                } else {
                    result = "Price was not updated";
                }
            } else {
                result = "Product not found";
            }

            //Use an if-else statement to classify the inventory
            String classification;
            if(products.size()<5){
                classification = "Small Inventory";
            } else if (products.size()>= 5 && products.size()<=10) {
                classification = "Medium Inventory";
            }else {
                classification = "Large Inventory";
            }

            //Display the following using System.out.println()
            System.out.println("Total products entered: "+totalEntered);
            System.out.println("Total unique products: "+products.size());
            System.out.println("All product names and prices: "+products);
            System.out.println("Search and update result: "+result);
            System.out.println("Inventory classification: "+classification);
        }
    }
}

