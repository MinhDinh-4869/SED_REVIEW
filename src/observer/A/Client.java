package observer.A;

public class Client {
    public static void main(String[] args)
    {
        InlineSource count = new CountSource();
        InlineSource up = new ToUpperSource();

        Printer p = new Printer();
        p.add(count);
        p.add(up);

        p.print();
    }
}
