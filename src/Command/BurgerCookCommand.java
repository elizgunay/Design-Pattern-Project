package Command;

public class BurgerCookCommand implements Command{

    private Cook cook;
    private String burgerKind;
    private String sauce;

    public BurgerCookCommand(Cook cook, String burgerKind, String sauce) {
        this.cook = cook;
        this.burgerKind = burgerKind;
        this.sauce = sauce;
    }

    @Override
    public void execute() {
        cook.makeBurger(burgerKind);
        cook.addSauce(sauce);

    }
}
