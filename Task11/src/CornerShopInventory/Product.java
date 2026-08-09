package CornerShopInventory;

import javax.swing.plaf.PanelUI;

public class Product implements SELLABLE{
    private String name = "";
    private Double price = 0.0;
    private Integer quantity = 0;

    public Product(String name, Double price, Integer quantity){
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public Product(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            IO.println("Name cannot be empty");
        }
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if(quantity >= 1 && quantity<=100){
            this.quantity = quantity;
        }else{
            IO.println("Quantity must be 1 to 100");
        }
    }

    public void setPrice(Double price) {
        if(price>=0 && price<= 10000){
            this.price = price;
        }else{
            IO.println("Price out of range");
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}');
    }

    @Override
    public double getPrice() {
        return price != null ? price : 0.0;
    }

    @Override
    public String getCategory() {
        return "[Product]";
    }
}
