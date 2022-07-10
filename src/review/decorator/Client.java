package review.decorator;

public class Client {
    public static void main(String[] args)
    {
        Composite windows = new AddHorizontalScrollBarDecorator(new AddScrollBarDecorator(new Window()));
        windows.draw();
    }
}
