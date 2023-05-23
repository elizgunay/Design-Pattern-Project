package Factory;


public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        BurgerProduct bf = burgerFactory.produceProduct("King");
        System.out.println("---------------------------------");

        Order order = new Order(burgerFactory.createProduct("King"));
        order.executeOrder();
        System.out.println("----------------------------------------------");

        // Приемане на поръчка
        Order order1 = new Order(burgerFactory.createProduct("King"));
        order.setSauce(new GarlicSauce());
        order.executeOrder();
        System.out.println("--------------------------------------");

        Order order2 = new Order(burgerFactory.createProduct("Classic"));
        order2.setSauce(new Ketchup());
        order2.executeOrder();
        System.out.println("------------------------------------------");

        Order order3 = new Order(burgerFactory.createProduct("Vegetarian"));
        order3.setSauce(new Ketchup());
        order3.executeOrder();



    }
}
