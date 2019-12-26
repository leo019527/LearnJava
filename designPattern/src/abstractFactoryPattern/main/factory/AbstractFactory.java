package abstractFactoryPattern.main.factory;

import abstractFactoryPattern.main.factory.colorFactory.colors.Color;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:28
 */
public abstract class AbstractFactory {
    public abstract Color getColor();

    public abstract abstractFactoryPattern.main.factory.shapeFactory.shapes.Shape getShape();
}
