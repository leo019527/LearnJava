package abstractFactoryPattern.main.factory;

import abstractFactoryPattern.main.factory.colorFactory.ColorFactory;
import abstractFactoryPattern.main.factory.colorFactory.colors.Color;
import abstractFactoryPattern.main.factory.shapeFactory.ShapeFactory;
import abstractFactoryPattern.main.factory.shapeFactory.shapes.Shape;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:49
 */
public class RedCircle extends AbstractFactory {
    @Override
    public Color getColor() {
        ColorFactory colorFactory = new ColorFactory();
        return colorFactory.getColor("RED");
    }

    @Override
    public Shape getShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        return shapeFactory.getShape("CIRCLE");
    }
}