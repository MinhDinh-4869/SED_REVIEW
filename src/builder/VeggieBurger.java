package builder;

public class VeggieBurger implements Item{
    private final int price = 25;
    public String getName()
    {
        return "Veggie Burger";
    }

    public int getPrice()
    {
        return this.price;
    }
}
