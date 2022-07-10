package observer.B;

public class Client {
    public static void main(String[] args)
    {
        Subject s = new ConcreteSubject();

        Observer o1 = new ConcreteObserver1(s);
        Observer o2 = new ConcreteObserver2(s);

        s.startProcess();
    }
}
