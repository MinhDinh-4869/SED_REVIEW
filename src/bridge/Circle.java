package bridge;

public class Circle extends Shape{
    public Circle(DrawAPI dAPI)
    {
        super(dAPI);
    }
    public void draw()
    {
        this.dAPI.drawShape();
    }
}
