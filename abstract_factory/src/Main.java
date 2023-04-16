import colour.Color;
import shape.Shape;

public class Main {

    /* Abstract Factory patterns work around a super-factory which creates
     * other factories. This factory is also called as factory of factories. This
     * type of design patterns comes under creational pattern as this pattern
     * provides one of the best ways to create an object.
     *
     * In abstract Factory pattern, an interface is responsible for creating
     * a factory of related objects without explicitly specifying their classes
     * Each generated factory can give the objects as per the Factory Pattern */

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}