package review.builder.Meal;

public class ChickenBurger implements Item{
    int price = 50;
    String name = "Chicken Burger";

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }
}
