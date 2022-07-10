package builder;

public class Client {
    public static void main(String[] args)
    {
        Builder b = new Builder();
        Meal m = b.buildOneCourseMeal(new ChickenBurger(), new Coke(), new Flan());
        m.showPrice();
    }
}
