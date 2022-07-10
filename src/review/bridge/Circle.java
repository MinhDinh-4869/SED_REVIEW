package review.bridge;

public class Circle implements Shape{
    DrawAPI api;

    public Circle(DrawAPI api)
    {
        this.api = api;
    }
    public void draw()
    {
        api.draw();
    }

}
