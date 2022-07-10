package builder;

public class ChickenBurger implements Item{
    private final int price = 50;
    public String getName()
    {
        return "Chicken Burger";
    }
    public int getPrice()
    {
        return this.price;
    }
}
