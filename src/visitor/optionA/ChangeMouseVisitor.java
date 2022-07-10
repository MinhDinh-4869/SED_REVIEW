package visitor.optionA;

import java.util.List;

public class ChangeMouseVisitor implements Visitor{
    public void visit(Computer c)
    {
        List<ComputerPartAbstract> parts = c.getParts();
        for(int i=0; i<parts.size(); i++)
        {
            parts.get(i).accept(this);
            if(parts.get(i) instanceof Mouse)
            {
                double id = parts.get(i).id;
                parts.set(i, new BluetoothMouse());
                parts.get(i).id = id;
            }
        }
    }

    public void visit(BluetoothMouse b){}
    public void visit(Mouse m){}
}
