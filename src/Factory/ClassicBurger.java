package Factory;

public class ClassicBurger extends BurgerProduct{
    public ClassicBurger() {
        name = "Classic";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name + " Burger!");
    }
}
