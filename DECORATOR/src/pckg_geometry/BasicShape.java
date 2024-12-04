package pckg_geometry;

public interface BasicShape {

    void drawShape();
    void resize();
    String description();
    boolean isHidden();
    void shapeName(String name);
}
