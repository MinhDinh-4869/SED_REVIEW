package visitor.optionA;

public class BluetoothMouse extends ComputerPartAbstract implements ComputerPart{
    public void accept(Visitor v)
    {
        v.visit(this);
    }

    @Override
    public void showHierarchy()
    {
        for(int i=0; i<this.id; i++)
        {
            System.out.print("-");
        }
        System.out.println("Bluetooth Mouse: " + this.id);
    }
}
