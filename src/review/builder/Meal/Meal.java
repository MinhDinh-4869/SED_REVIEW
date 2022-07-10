package review.builder.Meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items = new ArrayList<>();

    public void add(Item i)
    {
        items.add(i);
    }

    public void showItem()
    {
        for(Item item : items)
        {
            System.out.println(item.getName());
        }
    }

    public void showPrice()
    {
        int price = 0;
        for(Item item : items)
        {
            System.out.println(item.getName() + ": " + item.getPrice());
            price += item.getPrice();
        }

        System.out.println("Total price: " + price);
    }
}
