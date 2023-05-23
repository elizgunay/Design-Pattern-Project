package Factory;

public class VegetarianBurger extends BurgerProduct{

    public VegetarianBurger() {
        name = "Vegetarian";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name +" Burger!");
    }
}
