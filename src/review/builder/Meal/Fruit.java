package review.builder.Meal;

public class Fruit implements Item{
    String name = "Fruit";
    int price = 10;

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }
}
