package abstractFactoryPattern.main.factory.shapeFactory.shapes;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:00
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw in Square");
    }
}
