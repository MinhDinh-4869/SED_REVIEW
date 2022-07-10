package review.decorator;

public class AddScrollBarDecorator extends Decorator{
    public AddScrollBarDecorator(Composite component)
    {
        super(component);
    }

    public void draw()
    {
        super.draw();
        System.out.println("Drawing additionally a scroll bar");
    }
}
