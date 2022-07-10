package bridge;

public class Client {
    public static void main(String[] args)
    {
        Shape redCircle = new Circle(new RedCircleAPI());
        redCircle.draw();
    }
}
