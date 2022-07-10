package review.factory;

public class Client {
    public static void main(String[] args)
    {
        Interface object = Factory.getObject(1);
        object.say();

        object = Factory.getObject(2);
        object.say();
    }
}
