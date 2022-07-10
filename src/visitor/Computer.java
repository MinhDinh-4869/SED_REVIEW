package visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{
    int price = 1000;

    List<ComputerPart> computer;
    public Computer()
    {
        computer = new ArrayList<>();
    }
    public void add(ComputerPart c)
    {
        computer.add(c);
    }
    public void display()
    {
        for(ComputerPart cp : computer)
        {
            cp.display();
        }
    }

    public int count()
    {
        int count = 0;
        for(ComputerPart cp : computer)
        {
            count += cp.count();
        }
        return count;
    }

    public int calculatePrice()
    {
        int total_price = 0;
        for(ComputerPart cp : computer)
        {
            total_price += (cp.calculatePrice() + this.price);
        }
        return total_price;
    }
}
