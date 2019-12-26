package abstractFactoryPattern;


import abstractFactoryPattern.main.FactoryProducer;
import abstractFactoryPattern.main.factory.AbstractFactory;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:08
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory redcircle = FactoryProducer.getFactory("REDCIRCLE");
        redcircle.getShape().draw();
        redcircle.getColor().fill();
    }
}
