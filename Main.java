package MultipleObjectParameters_Demo;

public class Main {
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 1.99);
        lemonadeStand.greetCustomer("Eric");
        lemonadeStand.advertise("Expensive Lemons", 2.99);
    }
}
