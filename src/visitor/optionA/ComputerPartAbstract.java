package visitor.optionA;

public abstract class ComputerPartAbstract implements ComputerPart{
    public double id = 0;
    public abstract void accept(Visitor v);
}
