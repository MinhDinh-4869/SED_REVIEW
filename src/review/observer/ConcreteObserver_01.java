package review.observer;

public class ConcreteObserver_01 implements Observer{
    Subject s;
    public void attach(Subject s)
    {
        this.s = s;
    }

    public void update()
    {
        String message = s.getLine();
        System.out.println("Counting number of characters: " + message.length());
    }
}
