package Singleton_Restaurant;

public class Restaurant {
    private static Restaurant instance = null;
    private Cook cook;
    private Cashier cashier;

    private Restaurant() {
        cook = new Cook();
        cashier = new Cashier();
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public static void setInstance(Restaurant instance) {
        Restaurant.instance = instance;
    }

    public void takeOrder(String burgerKind,String sauce,Double amount) {
        System.out.println("Taking order: " + burgerKind + " burger with " + sauce + " sauce.");
        cook.makeBurger(burgerKind);
        cook.addSauce(sauce);
        cashier.processPayment(amount);
    }

}
