package abstractFactoryPattern.main.factory.shapeFactory.shapes;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 21:59
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw in Rectangle");
    }
}
