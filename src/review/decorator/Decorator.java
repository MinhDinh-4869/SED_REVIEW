package review.decorator;

public abstract class Decorator implements Composite{
    Composite component;

    public Decorator(Composite component)
    {
        this.component = component;
    }

    public void draw()
    {
        this.component.draw();
    }
}
