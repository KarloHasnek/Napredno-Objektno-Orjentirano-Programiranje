package vjezba4.zadatak1;

public enum FoodName {
    BURGER("Burger"),
    TOAST("Toast"),
    PIZZA("Pizza"),
    FRIES("Fries"),
    SALAD("Salad"),
    TORTILLA("Tortilla"),
    PASTA("Pasta"),
    RICE("Rice");

    private final String displayName;

    FoodName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
