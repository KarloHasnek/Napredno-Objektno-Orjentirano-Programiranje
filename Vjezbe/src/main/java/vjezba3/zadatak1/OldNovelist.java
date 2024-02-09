package vjezba3.zadatak1;

public class OldNovelist {

    private String name;

    public OldNovelist(String name) {
        this.name = name;
    }

    public void writeSFNovel() {
        System.out.println("Writing SF novel...");
    }

    @Override
    public String toString() {
        return "OldNovelist{" +
                "name='" + name + '\'' +
                '}';
    }
}
