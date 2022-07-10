package visitor.optionA;

public class Mouse extends ComputerPartAbstract implements ComputerPart{
    public void accept(Visitor v)
    {
        v.visit(this);
    }

    public void showHierarchy()
    {
        for(int i=0; i<this.id; i++)
        {
            System.out.print("-");
        }
        System.out.println("Mouse: " + this.id);
    }
}
