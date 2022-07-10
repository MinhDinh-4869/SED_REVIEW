package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> orderedMeal = new ArrayList<Item>();
    public void addItem(Item i)
    {
        orderedMeal.add(i);
    }

    public void showItem()
    {
        for(Item i : orderedMeal)
        {
            System.out.println(i.getName());
        }
    }
    public void showPrice()
    {
        int total = 0;
        int price;
        for(Item i : orderedMeal)
        {
            price = i.getPrice();
            System.out.println(i.getName() + ": " + price);
            total += price;
        }
        System.out.println("Total: " + total);
    }
}
