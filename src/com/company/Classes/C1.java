package com.company.Classes;

class Customer {
    public int customerId;
    public String customerName;
    public long customerNumber;
    public String customerAddress;

    public void displayCustomerDetails() {
        System.out.println("The id of the customer is: " + customerId);
        System.out.println("The name of the customer is: " + customerName);
        System.out.println("The address of the customer is: " + customerNumber);
        System.out.println("The number of the customer is: " + customerAddress);
    }

    public int payBill(double totalPrice, double discountPercentage) {
        System.out.println("Calculating the final bill to be paid");
        double priceAfterDiscount = (totalPrice * (1-discountPercentage/100));
        System.out.println("Hi " + customerName + " your final bill after discount is: " + (int)priceAfterDiscount);
        return (int)priceAfterDiscount;
    }

//    Pass by Value
    public void changeValue(int v1, int v2) {
        v1 = v1 + v2;
        v2 = v1 + v2;
        System.out.println(v1 + " " + v2);
    }

//    Pass by reference
    public long updateNumber(Customer customer) {
        customer.customerNumber = 9876543210L;
        return customerNumber;
    }
}

class Food {
    public String foodName;
    public String cuisine;
    public String foodType;
    public int quantityAvailable;
    public double unitPrice;

    public void displayFoodDetails() {
        System.out.println("Food Name: " + foodName);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Food Type: " + foodType);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Unit Price: " + unitPrice);
    }
}

public class C1 {
    public static void main(String[] args) {
//        Customer Object
        Customer customer = new Customer();
        customer.customerId = 12456;
        customer.customerName = "Amit";
        customer.customerNumber = 7584963210L;
        customer.customerAddress = "78/E New Residency";

        customer.displayCustomerDetails();
        customer.payBill(500, 10);

        int x = 10;
        int y = 20;
        System.out.println(x + " " + y);
        customer.changeValue(x,y);
        System.out.println(x + " " + y);

        System.out.println("The previous customer number is: " + customer.customerNumber);
        customer.updateNumber(customer);
        System.out.println("The updated value of the number is: " + customer.customerNumber);
//        Food Object
        Food item1 = new Food();
        item1.foodName = "Pizza";
        item1.cuisine = "Italian";
        item1.foodType = "Fast food";
        item1.quantityAvailable = 6;
        item1.unitPrice = 350;

        item1.displayFoodDetails();
    }
}
