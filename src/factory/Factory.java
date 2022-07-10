package factory;

public class Factory {
    public static ObjectInterface getObject(int option)
    {
        ObjectInterface ob;
        if( option == 1)
        {
            return ob = new Object1();
        }
        else
        {
            return ob = new Object2();
        }
    }
}
