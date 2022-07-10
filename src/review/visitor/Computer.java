package review.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{
    List<ComputerPart> parts = new ArrayList<>();
    String name;
    int level = 0;

    public Computer(String name)
    {
        this.name = name;
    }

    public void add(ComputerPart cp)
    {
        parts.add(cp);
    }

    public void accept(Visitor v)
    {
        v.visit(this);
    }

    public List<ComputerPart> getParts()
    {
        return this.parts;
    }

    public String getName()
    {
        return this.name;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getLevel()
    {
        return this.level;
    }
}
