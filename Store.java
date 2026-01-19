package MultipleObjectParameters_Demo;
 
public class Store {
    // instance fields
    String productType;
    Double productPrice;

    // constructor method
    public Store(String product, Double price) {
        productType = product;
        productPrice = price;
    }

    // greetCustomer() method
    public void greetCustomer(String customerName) {
        String message = "Welcome to the store, " + customerName + "!";
        System.out.println(message);
    }

    // advertisement method
    public void advertise(String productType, Double productPrice) {
        String message = "Selling " + productType + " for: $" + productPrice + ".";
        System.out.println(message);
    }
}
