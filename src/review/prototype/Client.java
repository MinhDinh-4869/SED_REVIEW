package review.prototype;

public class Client {
    public static void main(String[] args)
    {
        try {
            Factory factory = Factory.getINSTANCE();

            Shape shape1 = factory.getCopy("circle");
            Shape shape2 = factory.getCopy("square");
            Shape shape3 = factory.getCopy("triangle");

            shape1.draw();
            shape2.draw();
            shape3.draw();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
