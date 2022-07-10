package review.composite.optionB;

//implementation for binary tree
public class Component implements Composite{
    String name;

    Composite left = null;
    Composite right= null;

    public Component(String name)
    {
        this.name = name;
    }

    public void add(Composite c)
    {
        if(this.left == null)
        {
            this.left = c;
        }
        this.right = c;
    }

    public void showTree()
    {
        this.left.showTree();
        System.out.println(this.name);
        this.right.showTree();
    }
}
