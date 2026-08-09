package CornerShopInventory;

import java.lang.classfile.constantpool.PoolEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CornerShopInventoryMain {
    static List<SELLABLE> stock = new ArrayList<>();

    static Scanner input =  new Scanner(System.in);
    static void main(){
        IO.println("--- Single item created at startup ---");
        Product initialProduct = new Product("Rice 5kg", -5.0, 12);
        stock.add(initialProduct);
        InventoryInput();
    }

    public static void InventoryInput(){
        Boolean exit = false;
        while(exit == false){
            IO.println("""
                   --- SHOP MENU ---
                   1. add product
                   2. add service
                   3. print all stock
                   4. show total value
                   5. exit
                   Choose: 
                    """);
            Integer option = input.nextInt();
            if(option.equals(1)){
                stock.add(addProduct());
            }else if(option.equals(2)){
                stock.add(addService());
            } else if (option.equals(3)) {
                int index = 1;
                for(SELLABLE shop : stock){
                    IO.println(index++ +". ");
                    shop.printAllInfo();
                }
            }else if(option.equals(4)){
                double total = 0;
                for(SELLABLE item : stock){
                    total+=item.getPrice();
                }
                IO.println("The total value of the stock: "+total);
            }else if(option.equals(5)){
                exit = true;
            }
        }
    }

    public static Product addProduct(){
        Product product = new Product();
        IO.println("Enter product name: ");
        product.setName(input.next());
        IO.println("Enter product price: ");
        product.setPrice(input.nextDouble());
        IO.println("Enter product quantity: ");
        product.setQuantity(input.nextInt());
        product.printAllInfo();
        product.getPrice();
        product.getCategory();
        return product;
    }

    public static Service addService(){
        Service service = new Service();
        IO.println("Enter service name: ");
        service.setName(input.next());
        IO.println("Enter service price: ");
        service.setPrice(input.nextDouble());
        IO.println("Enter service minutes: ");
        service.setMinutes(input.nextInt());
        service.printAllInfo();
        service.getPrice();
        service.getCategory();
        return service;
    }
}
