package pckg_geometry;

public class Circle implements BasicShape {

    boolean hidden;
    private String shapeName;

    public Circle() {
        this.hidden = false;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: " + getClass().getSimpleName());
    }

    @Override
    public void resize() {
        System.out.println("Resizing: " + getClass().getSimpleName());
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Shape name: " + name);
    }

    @Override
    public String toString() {
        return "Circle";
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
