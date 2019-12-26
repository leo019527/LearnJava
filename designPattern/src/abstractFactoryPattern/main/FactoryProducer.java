package abstractFactoryPattern.main;

import abstractFactoryPattern.main.factory.AbstractFactory;
import abstractFactoryPattern.main.factory.RedCircle;

/**
 * @Author: leo019527
 * @Date: 2019/12/26 22:23
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice==null){
            return null;
        }
        if(choice.equalsIgnoreCase("REDCIRCLE")){
            return new RedCircle();
        }
        return null;
    }
}
