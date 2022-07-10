package visitor.optionA;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerPartAbstract implements ComputerPart{
    List<ComputerPartAbstract> parts = new ArrayList<>();
    public void add(ComputerPartAbstract c)
    {
        this.parts.add(c);
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }

    public List<ComputerPartAbstract> getParts()
    {
        return this.parts;
    }

    public void showHierarchy()
    {
        for(int i=0; i<this.id; i++)
        {
            System.out.print("-");
        }
        System.out.println("Computer: " + this.id);
        for(ComputerPart cp : parts)
        {
            cp.showHierarchy();
        }
    }
}
