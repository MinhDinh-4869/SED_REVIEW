package review.composite.optionA;

import java.util.ArrayList;
import java.util.List;

public class Component implements Composite{
    String name;
    List<Composite> composites = new ArrayList<>();

    public Component(String name)
    {
        this.name = name;
    }

    public void add(Composite c)
    {
        composites.add(c);
    }

    public void showTree()
    {
        System.out.println(this.name);
        for(Composite c : composites)
        {
            c.showTree();
        }
    }
}
