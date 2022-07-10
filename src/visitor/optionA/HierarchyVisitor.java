package visitor.optionA;

import java.util.List;

public class HierarchyVisitor implements Visitor{
    public void visit(Computer c)
    {
        List<ComputerPartAbstract> parts = c.getParts();
        for(ComputerPartAbstract part : parts)
        {
            part.id = c.id + 1;
            part.accept(this);
        }
    }

    public void visit(Mouse m){}
    public void visit(BluetoothMouse b){}
}
