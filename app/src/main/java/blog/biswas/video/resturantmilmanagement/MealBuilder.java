package blog.biswas.video.resturantmilmanagement;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder {
    public Meal makeVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;

    }
    public Meal makeNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new NonVageBurger());
        meal.addItem(new Coke());
        return meal;

    }

}
