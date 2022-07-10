package observer.B;

public class ConcreteObserver1 extends Observer{
    public ConcreteObserver1(Subject s)
    {
        super(s);
        s.attach(this);
    }

    public void update()
    {
        System.out.println("No. of lines: " + (s.getState()).length());
    }
}
