package decorator;

public abstract class Decorator {
    Component c;

    public Decorator(Component c)
    {
        this.c = c;
    }
    public String method()
    {
        return this.c.method();
    }
}
