package abstractFactoryPattern.main.factory.shapeFactory.shapes;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 21:58
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw in Circle");
    }
}
