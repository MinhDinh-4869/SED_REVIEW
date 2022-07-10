package review.singleton;

public class Client {
    public static void main(String[] args)
    {
        Singleton object = Singleton.getObject();
        object.say();

        Singleton object1 = Singleton.getObject();
        object1.say();
    }
}
