package review.builder.Meal;

public class VeggieBurger implements Item{
    String name = "Veggie Burger";
    int price = 30;

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }
}
