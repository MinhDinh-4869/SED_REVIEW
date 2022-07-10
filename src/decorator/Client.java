package decorator;

public class Client {
    public static void main(String[] args)
    {
        Component c = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        System.out.println(c.method());
    }
}
