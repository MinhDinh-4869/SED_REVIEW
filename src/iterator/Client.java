package iterator;

public class Client {
    public static void main(String[] args)
    {
        Container c = new ConcreteContainer();
        Iterator i = c.getIterator();
        c.sortList();

        while(i.hasNext())
        {
            System.out.print((String) i.next());
        }



    }
}
