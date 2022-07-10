package review.composite.optionB;

public class Leave implements Composite{
    String name;

    public Leave(String name)
    {
        this.name = name;
    }

    public void add(Composite c){};

    public void showTree()
    {
        System.out.println(this.name);
    }
}
