package builder;

public class Flan implements Item{
    private final int price = 10;
    public String getName()
    {
        return "Flan";
    }

    public int getPrice()
    {
        return this.price;
    }
}
