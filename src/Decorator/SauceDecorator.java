package Decorator;

public class SauceDecorator implements Burger{

    protected Burger burger;

    public SauceDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String sauce() {
        return burger.sauce();
    }

}
