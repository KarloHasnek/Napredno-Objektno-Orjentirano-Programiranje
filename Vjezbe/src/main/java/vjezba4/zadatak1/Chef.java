package vjezba4.zadatak1;

import java.util.ArrayList;
import java.util.HashMap;

public class Chef {

    private String chefName;

    public Chef(String chefName) {
        this.chefName = chefName;
    }

    public void analyzeOrder() {
        System.out.println(chefName + " is analyzing order");
    }

    public void collectFoodStaff(HashMap<FoodCat, ArrayList<Food>> order) {
        System.out.println(chefName + " is collecting food staff");
    }

    public void preparingFood(HashMap<FoodCat, ArrayList<Food>> order) {
        System.out.println(chefName + " is preparing food");
    }

    public void stopAndRecall(){

    }


}
