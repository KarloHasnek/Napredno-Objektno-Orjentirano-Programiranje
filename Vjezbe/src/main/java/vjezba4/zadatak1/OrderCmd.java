package vjezba4.zadatak1;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderCmd implements IntCmd{

    private int id;
    private static int cntID = 0;
    private HashMap<FoodCat, ArrayList<Food>> order;
    private int tableNumber;

    public OrderCmd(Chef chef, int tableNumber, HashMap<FoodCat, ArrayList<Food>> order) {
        this.id = cntID++;
        this.order = order;
        this.tableNumber = tableNumber;
    }

    @Override
    public void executeOrder() {
        System.out.println("Order with id: " + id + " is being executed");
    }

    @Override
    public void undoOrder() {
        System.out.println("Order with id: " + id + " is being undone");
    }
}
