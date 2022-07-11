package revision.singleton;

public class Client {
    public static void main(String[] args)
    {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();

        obj.showInfo();
        obj1.showInfo();
    }
}
