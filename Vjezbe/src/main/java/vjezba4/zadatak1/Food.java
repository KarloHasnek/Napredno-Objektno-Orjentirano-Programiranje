package vjezba4.zadatak1;

public class Food {

    private double price;
    private int id;
    private static int cntID = 0;
    private String food;

    public Food(FoodName foodName,double price) {
        this.food = foodName.getDisplayName();
        this.price = price;
        this.id = ++cntID;
    }
}
