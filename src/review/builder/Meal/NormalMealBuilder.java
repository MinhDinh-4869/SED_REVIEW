package review.builder.Meal;

import java.util.Scanner;

public class NormalMealBuilder implements Builder{
    public Meal buildMeal()
    {
        Meal orderedMeal = new Meal();
        orderedMeal.add(new ChickenBurger());
        orderedMeal.add(new Fruit());
        orderedMeal.add(new Coke());

        return orderedMeal;
    }
}
