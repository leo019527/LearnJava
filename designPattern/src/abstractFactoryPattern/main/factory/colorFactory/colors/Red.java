package abstractFactoryPattern.main.factory.colorFactory.colors;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:31
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill with Red");
    }
}
