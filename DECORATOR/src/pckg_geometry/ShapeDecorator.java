package pckg_geometry;

public abstract class ShapeDecorator implements BasicShape {

    protected BasicShape decoratedShape;

    protected ShapeDecorator(BasicShape shape) {
        this.decoratedShape = shape;
    }

    protected abstract void decorateShape();
}
