package visitor.optionA;

import java.util.List;

public class CountVisitor implements Visitor{
    public int counter = 0;
    public void visit(Mouse m)
    {
        this.counter++;
    }

    public void visit(BluetoothMouse b)
    {
        this.counter++;
    }

    public void visit(Computer c){
        List<ComputerPartAbstract> parts = c.getParts();
        for(ComputerPart part : parts)
        {
            part.accept(this);
            //Let the component use accept as it can accept any type of the Visitor
            //Don't let the Visitor visit() as it may not know what the type of the component is
        }
    }
}
