package review.visitor;

public class Mouse implements ComputerPart{
    String name;
    int level;

    public Mouse(String name)
    {
        this.name = name;
    }

    public void accept(Visitor v)
    {
        v.visit(this);
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
