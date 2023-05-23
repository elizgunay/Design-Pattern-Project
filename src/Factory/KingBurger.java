package Factory;

public class KingBurger extends BurgerProduct{
    public KingBurger() {
        name = "King";
    }
    @Override
    public void prepare() {
        System.out.println("Preparing "+name+" burger!");
    }
}
