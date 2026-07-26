import java.util.HashSet;

public class ProductInventorySet {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a HashSet<String> to store product names
        HashSet<String> names = new HashSet<>();

        //Asking user to enter number of products
        IO.println("Please enter number of products: ");
        int NumOfProducts = Integer.parseInt(IO.readln());

        //If the entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfProducts<=0) {
            IO.println("Invalid number of students");
        }else {
            //Use a for loop to read each product name from the user
            for (int i = 0; i < NumOfProducts; i++) {
                IO.println("Enter name of the product: ");
                String productName = IO.readln();
                totalEntered++;

                if (!names.add(productName)) {
                    IO.println("Product already exists. Duplicate entries are not allowed");
                }
            }

            //Search for product name
            IO.println("Enter product name to search for: ");
            String searchName = IO.readln();

            //Checking whether product exists or not
            String searchResult;
            if(names.contains(searchName)){
                searchResult = "Product found in inventory";
            }else{
                searchResult = "Product not found in inventory";
            }

            //Use an if-else statement to classify the inventory
            String inventoryClassification;
            if(names.size()<5){
                inventoryClassification = "Small Inventory";
            } else if (names.size()>= 5 && names.size()<=10) {
                inventoryClassification = "Medium Inventory";
            }else{
                inventoryClassification = "Large Inventory";
            }

            //Display the following using System.out.println()
            System.out.println("Total products entered: "+totalEntered);
            System.out.println("Total unique products: "+names.size());
            System.out.println("All products in the inventory: "+names);
            System.out.println("Search result: "+searchResult+" and name "+searchName);
            System.out.println("The inventory classification: "+inventoryClassification);
        }

    }
}
