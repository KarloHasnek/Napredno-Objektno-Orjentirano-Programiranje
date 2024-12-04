package pckg_geometry;

public class LineStyleDecorator extends ShapeDecorator{

    private LINESTYLE lineStyle;

    protected LineStyleDecorator(BasicShape shape, LINESTYLE style) {
        super(shape);
        this.lineStyle = style;
    }

    @Override
    protected void decorateShape() {
        System.out.println("Filling style: " + lineStyle + " for shape: " + this.decoratedShape);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing: " + this.decoratedShape + " with line style: " + lineStyle);
    }

    @Override
    public void resize() {
        System.out.println("Resizing: " + this.decoratedShape + " with style: " + lineStyle);
    }

    @Override
    public String description() {
        return "Shape: " + this.decoratedShape + " with style: " + lineStyle;
    }

    @Override
    public boolean isHidden() {
        return this.decoratedShape.isHidden();
    }

    @Override
    public void shapeName(String name) {
        System.out.println("Shape name: " + name + " with style: " + lineStyle);
    }

    @Override
    public String toString() {
        return this.decoratedShape.toString() + " with line style " + lineStyle;
    }
}
