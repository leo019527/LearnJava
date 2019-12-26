package factoryPattern.main;

import factoryPattern.main.shapes.Circle;
import factoryPattern.main.shapes.Rectangle;
import factoryPattern.main.shapes.Shape;
import factoryPattern.main.shapes.Square;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:01
 */
public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
