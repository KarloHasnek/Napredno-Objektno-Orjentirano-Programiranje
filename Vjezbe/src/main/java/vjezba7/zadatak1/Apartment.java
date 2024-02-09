package vjezba7.zadatak1;

public class Apartment {

    private String location;
    private String category;

    public Apartment(String location, String category) {
        this.location = location;
        this.category = category;
    }

    public void description() {
        System.out.println("Apartment is located in " + location + " and is " + category + " category.");
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
