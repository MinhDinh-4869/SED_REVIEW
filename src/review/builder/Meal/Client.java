package review.builder.Meal;

public class Client {
    public static void main(String[] args)
    {
        Builder b = new NormalMealBuilder();
        Meal orderedMeal = b.buildMeal();

        orderedMeal.showPrice();
    }
}
