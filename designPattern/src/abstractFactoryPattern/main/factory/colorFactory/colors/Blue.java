package abstractFactoryPattern.main.factory.colorFactory.colors;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:32
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill with Blue");
    }
}
