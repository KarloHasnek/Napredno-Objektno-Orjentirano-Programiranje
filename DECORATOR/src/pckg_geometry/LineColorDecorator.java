package pckg_geometry;

public class LineColorDecorator extends ShapeDecorator {

    private SHAPECOLOR lineColor;

    protected LineColorDecorator(BasicShape shape, SHAPECOLOR color) {
        super(shape);
        this.lineColor = color;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Filling color: " + lineColor + " for shape: " + this.decoratedShape);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: " + this.decoratedShape + " with line color: " + lineColor);
    }

    @Override
    public void resize() {
        System.out.println("Resizing: " + this.decoratedShape + " with color: " + lineColor);
    }

    @Override
    public String description() {
        return "Shape: " + this.decoratedShape + " with color: " + lineColor;
    }

    @Override
    public boolean isHidden() {
        return this.decoratedShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Shape name: " + name + " with color: " + lineColor);
    }

    @Override
    public String toString() {
        return this.decoratedShape.toString() + " filled with color " + lineColor;
    }
}
