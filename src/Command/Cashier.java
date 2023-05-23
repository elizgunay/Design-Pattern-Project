package Command;

import java.util.ArrayList;
import java.util.List;

public class Cashier {
    private Cook cook;
    private List<Command> orders;

    public Cashier() {
        cook = new Cook();
        orders = new ArrayList<>();
    }

    public void takeOrder(Command command) {
        orders.add(command);
    }

    public void executingOrders() {
        for (Command command : orders) {
            command.execute();
        }
        orders.clear();
    }
}
