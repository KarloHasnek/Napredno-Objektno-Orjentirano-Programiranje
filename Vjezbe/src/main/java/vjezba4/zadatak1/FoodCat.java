package vjezba4.zadatak1;

public class FoodCat {

    private int id;
    private static int cntID = 0;
    private String food;

    public FoodCat(FoodNameCat foodNameCat) {
        this.food = foodNameCat.getDisplayName();
        this.id = ++cntID;
    }

    @Override
    public String toString() {
        return "FoodCat{" +
                "id=" + id +
                ", food='" + food + '\'' +
                '}';
    }
}
