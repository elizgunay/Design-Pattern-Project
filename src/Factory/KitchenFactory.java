package Factory;

public abstract class KitchenFactory{

    public abstract BurgerProduct createProduct(String name);

    public BurgerProduct produceProduct(String name) {
        BurgerProduct product = createProduct(name);
        product.prepare();
        return product;
    }
}
