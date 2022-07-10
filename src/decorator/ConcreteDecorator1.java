package decorator;

public class ConcreteDecorator1 extends Decorator implements Component{
    public ConcreteDecorator1(Component c)
    {
        super(c);
    }

    public String method()
    {
        return super.method() + "Add Setting 1";
    }
}
