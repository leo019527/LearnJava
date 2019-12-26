package abstractFactoryPattern.main.factory.colorFactory;

import abstractFactoryPattern.main.factory.AbstractFactory;
import abstractFactoryPattern.main.factory.colorFactory.colors.Blue;
import abstractFactoryPattern.main.factory.colorFactory.colors.Color;
import abstractFactoryPattern.main.factory.colorFactory.colors.Green;
import abstractFactoryPattern.main.factory.colorFactory.colors.Red;
import factoryPattern.main.shapes.Shape;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:30
 */
public class ColorFactory{
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("BLUE"))
            return new Blue();
        else if (color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if (color.equalsIgnoreCase("RED"))
            return new Red();
        return null;
    }
}
