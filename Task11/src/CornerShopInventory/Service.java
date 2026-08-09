package CornerShopInventory;

public class Service implements SELLABLE{
    private String name;
    private Double price;
    private Integer minutes;

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        if(minutes != null && minutes>0){
            this.minutes = minutes;
        }else{
            this.minutes = 0;
        }
    }

    public void setPrice(Double price) {
        if(price>= 0 && price<= 10000){
            this.price = price;
        }else{
            IO.println("Price out of range");
        }
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

    @Override
    public void printAllInfo() {
        IO.println("Service{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", minutes=" + minutes +
                '}');
    }

    @Override
    public double getPrice() {
        return price != null ? price : 0.0;
    }

    @Override
    public String getCategory() {
        return "[Service]";
    }

}
