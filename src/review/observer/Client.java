package review.observer;

public class Client {
    public static void main(String[] args)
    {
        Subject s = new Subject();

        Observer o1 = new ConcreteObserver_01();
        Observer o2 = new ConcreteObserver_02();

        s.attach(o1);
        s.attach(o2);

        s.runProcess();
    }
}
