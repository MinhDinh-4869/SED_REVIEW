package newpackage;

public abstract class Component {
    protected String name;
    public Component(String name)
    {
        this.name = name;
    }
    public abstract void printLeftToRight();
    public abstract void printRightToLeft();
}
