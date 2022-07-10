package bridge;

public abstract class Shape {
    protected DrawAPI dAPI;
    public abstract void draw();
    public Shape(DrawAPI dAPI)
    {
        this.dAPI = dAPI;
    }
}
