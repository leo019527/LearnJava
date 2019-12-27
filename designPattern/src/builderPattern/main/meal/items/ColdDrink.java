package builderPattern.main.meal.items;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:54
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
