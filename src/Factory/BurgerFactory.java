package Factory;

public class BurgerFactory extends KitchenFactory{

    @Override
    public BurgerProduct createProduct(String type) {
        if (type.equals("King")) {
            return new KingBurger();
        } else if (type.equals("Classic")) {
            return new ClassicBurger();
        } else if (type.equals("Vegetarian")) {
            return new VegetarianBurger();
        } else {
            return null;
        }
    }
}
