package factory;

public class Client {
    public static void main(String[] args)
    {
        ObjectInterface ob;

        ob = Factory.getObject(1);
        ob.print();

        ob = Factory.getObject(2);
        ob.print();
    }
}
