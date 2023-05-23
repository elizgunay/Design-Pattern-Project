package Factory;

public abstract class BurgerProduct {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void cook() {
        System.out.println("Cooking of " + name + " burger");
    }



    public abstract void prepare();


}
