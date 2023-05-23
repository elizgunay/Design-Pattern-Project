package Decorator;

public class Main {
    public static void main(String[] args) {
        // Създаване на кралски бургер
        Burger kindBurger = new KingBurger();
        System.out.println(kindBurger.sauce());

        Burger burgerWithGarlicSauce = new GarlicSauceDecorator(kindBurger);
        System.out.println(burgerWithGarlicSauce.sauce());

        Burger burgerWithKetchupSauce = new KetchupDecorator(kindBurger);
        System.out.println(burgerWithKetchupSauce.sauce());

        System.out.println("-----------------------------------------");
        // Създаване на класически бургер
        Burger classicBurger = new ClassicBurger();
        System.out.println(classicBurger.sauce());

        Burger classicBurgerWithGarlicSauce = new GarlicSauceDecorator(classicBurger);
        System.out.println(classicBurgerWithGarlicSauce.sauce());

        Burger classicBurgerWithKetchupSauce = new KetchupDecorator(classicBurger);
        System.out.println(classicBurgerWithKetchupSauce.sauce());


    }
}
