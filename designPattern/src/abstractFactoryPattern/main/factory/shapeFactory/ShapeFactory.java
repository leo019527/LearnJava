package abstractFactoryPattern.main.factory.shapeFactory;

import abstractFactoryPattern.main.factory.shapeFactory.shapes.Circle;
import abstractFactoryPattern.main.factory.shapeFactory.shapes.Rectangle;
import abstractFactoryPattern.main.factory.shapeFactory.shapes.Shape;
import abstractFactoryPattern.main.factory.shapeFactory.shapes.Square;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:30
 */
public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shape.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}
