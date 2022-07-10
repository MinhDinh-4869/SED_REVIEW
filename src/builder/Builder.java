package builder;

public class Builder {
    private Meal orderingMeal;
    public Meal buildOneCourseMeal(Item main, Item bev, Item des)
    {
        orderingMeal = new Meal();
        orderingMeal.addItem(main);
        orderingMeal.addItem(bev);
        orderingMeal.addItem(des);

        return orderingMeal;
    }
}
