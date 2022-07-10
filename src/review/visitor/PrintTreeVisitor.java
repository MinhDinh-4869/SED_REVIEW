package review.visitor;

import java.util.List;

public class PrintTreeVisitor implements Visitor{
    public void visit(Computer computer)
    {
        List<ComputerPart> parts = computer.getParts();
        for(int i=0; i<computer.getLevel(); i++)
        {
            System.out.print("-");
        }
        System.out.println(computer.getName());
        for(ComputerPart part : parts)
        {
            part.accept(this);
        }
    }

    public void visit(Mouse m)
    {
        for(int i=0; i<m.getLevel(); i++)
        {
            System.out.print("-");
        }
        System.out.println(m.getName());
    }

    public void visit(Keyboard kb)
    {
        for(int i=0; i<kb.getLevel(); i++)
        {
            System.out.print("-");
        }
        System.out.println(kb.getName());
    }
}
