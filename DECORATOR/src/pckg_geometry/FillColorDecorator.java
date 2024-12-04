package pckg_geometry;

public class FillColorDecorator extends ShapeDecorator {

    private SHAPECOLOR color;

    protected FillColorDecorator(BasicShape shape, SHAPECOLOR color) {
        super(shape);
        this.color = color;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Filling color: " + color + " for shape: " + this.decoratedShape);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: " + this.decoratedShape + " filled with color: " + color);
    }

    @Override
    public void resize() {
        System.out.println("Resizing: " + this.decoratedShape + " with color: " + color);
    }

    @Override
    public String description() {
        return "Shape: " + this.decoratedShape + " with color: " + color;
    }

    @Override
    public boolean isHidden() {
        return this.decoratedShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Shape name: " + name + " with color: " + color);
    }

    @Override
    public String toString() {
        return this.decoratedShape.toString() + " filled with color " + color;
    }
}
