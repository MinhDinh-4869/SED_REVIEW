package visitor.optionA;

import java.util.List;

public class AddIndexVisitor implements Visitor{

    public void visit(Computer c)
    {
        List<ComputerPartAbstract> parts = c.getParts();
        for(int i=1; i<parts.size() + 1; i++)
        {
            parts.get(i-1).id = parts.get(i-1).id + 0.1*i;
            parts.get(i-1).accept(this);
        }
    }

    public void visit(Mouse m){}
    public void visit(BluetoothMouse b){}
}
