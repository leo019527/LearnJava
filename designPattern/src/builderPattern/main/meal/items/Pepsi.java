package builderPattern.main.meal.items;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:55
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
