import java.util.ArrayList;

public class OrderManagementSystem {
    public static void main(String[] args){
        //Create the following ArrayLists
        //1. Order ID
        ArrayList<Integer> orderIds = new ArrayList<>();
        //2. Customer name
        ArrayList<String> customerNames = new ArrayList<>();
        //3. Product name
        ArrayList<String> productNames = new ArrayList<>();
        //4. Quantity
        ArrayList<Integer> quantities = new ArrayList<>();
        //5. Product price
        ArrayList<Double> prices = new ArrayList<>();
        //6. Order status
        ArrayList<String> orderStatus = new ArrayList<>();

        //7. Store information for at least 15 orders
        orderIds.add(1001);
        customerNames.add("Ali");
        productNames.add("Laptop");
        quantities.add(2);
        prices.add(750.0);
        orderStatus.add("Pending");

        orderIds.add(1002);
        customerNames.add("Ahmed");
        productNames.add("Mouse");
        quantities.add(5);
        prices.add(15.0);
        orderStatus.add("Completed");

        orderIds.add(1003);
        customerNames.add("Rashid");
        productNames.add("Keyboard");
        quantities.add(3);
        prices.add(45.0);
        orderStatus.add("Pending");

        orderIds.add(1004);
        customerNames.add("Khalfan");
        productNames.add("Monitor");
        quantities.add(1);
        prices.add(220.0);
        orderStatus.add("Shipped");

        orderIds.add(1005);
        customerNames.add("Jokha");
        productNames.add("Headphones");
        quantities.add(2);
        prices.add(85.0);
        orderStatus.add("Completed");

        orderIds.add(1006);
        customerNames.add("Hamida");
        productNames.add("Tablet");
        quantities.add(1);
        prices.add(350.0);
        orderStatus.add("Cancelled");

        orderIds.add(1007);
        customerNames.add("Nasser");
        productNames.add("Smartphone");
        quantities.add(1);
        prices.add(650.0);
        orderStatus.add("Completed");

        orderIds.add(1008);
        customerNames.add("Sept");
        productNames.add("Printer");
        quantities.add(2);
        prices.add(180.0);
        orderStatus.add("Pending");

        orderIds.add(1009);
        customerNames.add("Hamed");
        productNames.add("Desk Chair");
        quantities.add(4);
        prices.add(120.0);
        orderStatus.add("Shipped");

        orderIds.add(1010);
        customerNames.add("Nawras");
        productNames.add("USB Drive");
        quantities.add(10);
        prices.add(12.5);
        orderStatus.add("Completed");

        orderIds.add(1011);
        customerNames.add("Sondos");
        productNames.add("Webcam");
        quantities.add(2);
        prices.add(55.0);
        orderStatus.add("Pending");

        orderIds.add(1012);
        customerNames.add("Hoor");
        productNames.add("External Hard Drive");
        quantities.add(1);
        prices.add(95.0);
        orderStatus.add("Shipped");

        orderIds.add(1013);
        customerNames.add("Taif");
        productNames.add("Microphone");
        quantities.add(1);
        prices.add(130.0);
        orderStatus.add("Completed");

        orderIds.add(1014);
        customerNames.add("I");
        productNames.add("Graphics Tablet");
        quantities.add(3);
        prices.add(210.0);
        orderStatus.add("Pending");

        orderIds.add(1015);
        customerNames.add("Hawa");
        productNames.add("Speakers");
        quantities.add(2);
        prices.add(65.0);
        orderStatus.add("Completed");

        //Display Order Information
        for(int i=0; i < orderIds.size(); i++){
            //1.  Order index
            System.out.println("Order Index: "+i+": ");

            //2. Order ID
            System.out.println("Order ID: "+orderIds.get(i));

            //3. Customer name
            System.out.println("Customer name: "+customerNames.get(i));

            //4. Product name
            System.out.println("Product name: "+productNames.get(i));

            //5. Quantity
            System.out.println("Quantity: "+quantities.get(i));

            //6. Price
            System.out.println("Price: "+prices.get(i));

            //7. Total price
            double total = quantities.get(i) * prices.get(i);
            System.out.println("Total price: " + total);

            //8. Status
            System.out.println("Status: "+orderStatus.get(i));
        }

        //Add New Order
        //1. Ask the user for Customer name
        IO.println("Enter Customer name: ");
        String custName = IO.readln();
        //2. Ask the user for Product name
        IO.println("Enter Product name: ");
        String proName = IO.readln();
        //3. Ask user for Quantity
        IO.println("Enter Quantity: ");
        int quantity = Integer.parseInt(IO.readln());
        //4. Ask the user for Price
        IO.println("Enter Price: ");
        double price = Double.parseDouble(IO.readln());
        //5. Ask the user for  Order status
        IO.println("Enter Order status: ");
        String status = IO.readln();

        //4. Add the book information to the lists
        orderIds.add(1001+orderIds.size());
        customerNames.add(custName);
        productNames.add(proName);
        quantities.add(quantity);
        prices.add(price);
        orderStatus.add(status);
        System.out.println("Order added successfully");


        //Calculate Order Statistics
        //1. Total number of orders
        System.out.println("Total Employees:"+orderIds.size());

        //2. Total sales amount
        double sum = 0.0;
        for(int i = 0; i < prices.size(); i++){
            sum += (quantities.get(i) * prices.get(i));
        }
        System.out.println("Total sales amount: " + sum);

        //3. Average order value
        double average = (double) sum/ prices.size();
        System.out.println("Average order value: "+average);

        //4. Highest order value & Lowest order value
        double highest = quantities.get(0)*prices.get(0);
        double lowest = quantities.get(0)*prices.get(0);
        for(int i = 0; i < orderIds.size(); i++){
            double orderVal = quantities.get(i) * prices.get(i);
            if(orderVal > highest){
                highest = orderVal;
            }
            if(orderVal < lowest){
                lowest = orderVal;
            }
        }
        System.out.println("Highest Order:"+highest);
        System.out.println("Lowest Order: "+lowest);

        //Order Status Analysis
        int pendingOrders = 0;
        int completedOrders = 0;
        int cancelledOrders = 0;
        int shippedOrders = 0;

        for(String statusStr : orderStatus){
            if(statusStr.equalsIgnoreCase("Pending")){
                pendingOrders++;
            } else if(statusStr.equalsIgnoreCase("Completed")){
                completedOrders++;
            } else if(statusStr.equalsIgnoreCase("Cancelled")){
                cancelledOrders++;
            } else if(statusStr.equalsIgnoreCase("Shipped")){
                shippedOrders++;
            }
        }
        System.out.println("Pending Orders: " + pendingOrders);
        System.out.println("Completed Orders: " + completedOrders);
        System.out.println("Shipped Orders: " + shippedOrders);
        System.out.println("Cancelled Orders: " + cancelledOrders);

        //Search Order System
        //1. Allow users to search using either option 1 or option 2
        IO.println("Search by: 1) Order ID  2) Customer Name");
        int choice = Integer.parseInt(IO.readln());

        //2. Check if the product exists
        int searchIndex = -1;
        if(choice == 1) {
            IO.println("Enter Order ID: ");
            int searchId = Integer.parseInt(IO.readln());
            for(int i = 0; i < orderIds.size(); i++) {
                if(orderIds.get(i) == searchId) {
                    searchIndex = i;
                    break;
                }
            }
        } else {
            IO.println("Enter Customer Name: ");
            String searchName = IO.readln();
            for(int i = 0; i < customerNames.size(); i++) {
                if(customerNames.get(i).equalsIgnoreCase(searchName)) {
                    searchIndex = i;
                    break;
                }
            }
        }
        if (searchIndex != -1) {
            //Display Order details, Total price, Current status
            System.out.println("Order details:  " + searchIndex);
            System.out.println("Total price:  " + quantities.get(searchIndex)*prices.get(searchIndex));
            System.out.println("Current status: " + orderStatus.get(searchIndex));
        } else {
            System.out.println("Order not found");
        }

        //Update Order System
        //1. Ask the user for the order index
        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());

        //2. Replace the old order info with a order info
        if (index >= 0 && index < orderIds.size()) {
            //A. Allow updating Customer name
            IO.println("New Customer name: ");
            String updatedName= IO.readln();

            //B. Allow updating Product name
            IO.println("New Product name: ");
            String updatedProName = IO.readln();

            //C. Allow updating Quantity
            IO.println("New Quantity: ");
            int updatedQuantity = Integer.parseInt(IO.readln());

            //E. Allow updating Price
            IO.println("New Price: ");
            double updatedPrice = Double.parseDouble(IO.readln());

            //F. Allow updating Status
            IO.println("New Status: ");
            String updatedStatus = IO.readln();

            customerNames.set(index, updatedName);
            productNames.set(index, updatedProName);
            quantities.set(index, updatedQuantity);
            prices.set(index, updatedPrice);
            orderStatus.set(index, updatedStatus);
            System.out.println("Order updated successfully");
        } else {
            System.out.println("Invalid index!");
        }

        // Discount Calculation System
        for (int i = 0; i < orderIds.size(); i++) {
            double totalAmount = quantities.get(i) * prices.get(i);
            double discountRate = (totalAmount >= 5000) ? 0.15 : (totalAmount >= 2000) ? 0.10 : (totalAmount >= 1000) ? 0.05 : 0.0;
            double discountAmount = totalAmount * discountRate;
            double finalPrice = totalAmount - discountAmount;
            System.out.println("Customer: " + customerNames.get(i));
            System.out.println("Original Price: " + totalAmount);
            System.out.println("Discount Amount: " + discountAmount);
            System.out.println("Final Price: " + finalPrice);
        }
    }


}
