package review.builder.Meal;

public class Milk implements Item{
    String name = "Milk";
    int price = 7;

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }
}
