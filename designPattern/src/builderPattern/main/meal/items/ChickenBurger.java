package builderPattern.main.meal.items;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:55
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
