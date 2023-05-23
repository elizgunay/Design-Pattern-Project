package Decorator;

public class GarlicSauceDecorator extends SauceDecorator{
    public GarlicSauceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String sauce() {
        return burger.sauce() + " with garlic sauce";
    }
}
