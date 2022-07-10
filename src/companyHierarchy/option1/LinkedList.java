package companyHierarchy.option1;

public class LinkedList {
    private String code;
    private LinkedList next = null;
    public LinkedList(){}
    public LinkedList(String code)
    {
        this.code = code;
    }

    public LinkedList insert(LinkedList root, String code)
    {
        if (root == null)
        {
            return new LinkedList(code);
        }
        else
        {
            root.next = root.next.insert(root.next, code);
        }
        return root;
    }

    public void printList(LinkedList root)
    {
        if (root == null)
        {
            ;
        }
        System.out.println(root.code);
        root.next.printList(root.next);
    }
}
