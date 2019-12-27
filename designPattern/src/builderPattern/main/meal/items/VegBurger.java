package builderPattern.main.meal.items;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:55
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
