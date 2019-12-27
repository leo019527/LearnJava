package builderPattern.main;

import builderPattern.main.meal.Meal;
import builderPattern.main.meal.items.ChickenBurger;
import builderPattern.main.meal.items.Coke;
import builderPattern.main.meal.items.Pepsi;
import builderPattern.main.meal.items.VegBurger;

/**
 * @Author: leo019527
 * @Date: 2019/12/27 22:52
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
