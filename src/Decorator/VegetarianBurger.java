package Decorator;

public class VegetarianBurger implements Burger{
    @Override
    public String sauce() {
        return "Vegetarian Burger";
    }
}
