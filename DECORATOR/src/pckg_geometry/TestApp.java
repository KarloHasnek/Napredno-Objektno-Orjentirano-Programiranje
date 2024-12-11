package pckg_geometry;

public class TestApp {

    public static void main(String[] args) {
        BasicShape circle = new Circle();
        circle.drawShape();
        FillColorDecorator fillColorDecorator = new FillColorDecorator(circle, SHAPECOLOR.RED);
        fillColorDecorator.drawShape();
        LineColorDecorator lineColorDecorator = new LineColorDecorator(fillColorDecorator, SHAPECOLOR.GREEN);
        lineColorDecorator.drawShape();

        BasicShape cirlce2 = new LineStyleDecorator(new LineColorDecorator(new FillColorDecorator(new Circle(), SHAPECOLOR.RED),SHAPECOLOR.BLUE ), LINESTYLE.DASHED);
        cirlce2.drawShape();
    }
}
