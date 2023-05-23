package Decorator;

public class KetchupDecorator extends SauceDecorator{
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String sauce() {
        return burger.sauce() + " with ketchup sauce";
    }
}
