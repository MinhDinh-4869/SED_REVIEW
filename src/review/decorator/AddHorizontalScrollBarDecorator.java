package review.decorator;

public class AddHorizontalScrollBarDecorator extends Decorator{
    public AddHorizontalScrollBarDecorator(Composite component)
    {
        super(component);
    }

    public void draw()
    {
        super.draw();
        System.out.println("Drawing additionally horizontal scroll bar");
    }
}
