package Factory;

public class Order {
    private BurgerProduct burger;
    private Sauce sauce;

    public Order(BurgerProduct burger) {
        this.burger = burger;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void executeOrder() {
        System.out.println("Order preparation:");
        burger.prepare();
        burger.cook();
        if (sauce != null) {
            System.out.println("Add " + sauce.getName() + " to " + burger.getName() + " burger.");
        }
        System.out.println("The order is ready!");
        System.out.println(":)");
    }
}
