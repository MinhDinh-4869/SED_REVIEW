package review.interator;

public class Client {
    public static void main(String[] args)
    {
        Container con = new Container();
        Iterator ite = con.getIterator();

        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
    }
}
