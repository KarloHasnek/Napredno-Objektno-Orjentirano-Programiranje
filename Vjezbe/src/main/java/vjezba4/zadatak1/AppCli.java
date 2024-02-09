package vjezba4.zadatak1;

import java.util.ArrayList;
import java.util.HashMap;

public class AppCli {

    public static void main(String[] args) {

        WaiterInvok waiter = new WaiterInvok("Karlo");
        Food food = new Food(FoodName.PIZZA, 20.0);
        Chef chef = new Chef("KarloVeliki");
        HashMap<FoodCat, ArrayList<Food>> order = new HashMap<>();
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(food);
        order.put(new FoodCat(FoodNameCat.COLD), foodList);

        waiter.setOrderCmd(new OrderCmd(chef,1, order));
        waiter.setUpOrder();
        waiter.withdrawOrder();

    }
}
