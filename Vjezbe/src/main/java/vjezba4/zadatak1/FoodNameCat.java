package vjezba4.zadatak1;

public enum FoodNameCat {

    SOUPS("SOUPS"),
    FISH("FISH"),
    ROAST("ROAST"),
    COLD("COLD"),
    DESSERT("DESSERT"),
    VEGETABLES("VEGETABLES");

    private final String displayName;

    FoodNameCat(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    }
