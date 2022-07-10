package review.visitor;

import java.util.List;

public class SetLevelVisitor implements Visitor{
    public void visit(Computer computer)
    {
        List<ComputerPart> parts = computer.getParts();
        for(ComputerPart part : parts)
        {
            part.setLevel(computer.getLevel() + 1);
            part.accept(this);
        }
    }

    public void visit(Mouse m){}

    public void visit(Keyboard kb){}
}
