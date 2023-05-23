package Singleton_Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = Restaurant.getInstance();

        restaurant.takeOrder("Classic", "Ketchup",10.00);
        restaurant.takeOrder("Kind", "Garlic",16.00);
        restaurant.takeOrder("Vegetarian", "Garlic",8.00);
    }
}