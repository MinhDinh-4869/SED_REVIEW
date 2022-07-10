package observer.B;

public class ConcreteObserver2 extends Observer{
    public ConcreteObserver2(Subject s)
    {
        super(s);
        s.attach(this);
    }

    public void update()
    {
        System.out.println("Responding: " + s.getState().toUpperCase());
    }
}
