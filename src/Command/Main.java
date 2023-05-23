package Command;


public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        BurgerCookCommand order1 = new BurgerCookCommand(new Cook(), "Kind", "Ketchup");
        BurgerCookCommand order2 = new BurgerCookCommand(new Cook(), "Classic", "Garlic");
        BurgerCookCommand order3 = new BurgerCookCommand(new Cook(), "Vegetarian", "Ketchup");

        cashier.takeOrder(order1);
        cashier.takeOrder(order2);
        cashier.takeOrder(order3);

        cashier.executingOrders();

    }
}
