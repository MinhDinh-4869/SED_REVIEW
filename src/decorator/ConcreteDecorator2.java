package decorator;

public class ConcreteDecorator2 extends Decorator implements Component{
    public ConcreteDecorator2(Component c)
    {
        super(c);
    }

    public String method()
    {
        return super.method() + "Add Setting 2";
    }
}
