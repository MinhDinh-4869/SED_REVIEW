package visitor.optionA;

public class Client {
    public static void main(String[] args)
    {
        Computer com = new Computer();
        com.add(new Mouse());
        com.add(new Mouse());
        com.add(new Mouse());
        Computer com1 = new Computer();

        com1.add(new Mouse());
        com1.add(new Mouse());
        com.add(com1);

        ChangeMouseVisitor v2 = new ChangeMouseVisitor();
        HierarchyVisitor v = new HierarchyVisitor();
        AddIndexVisitor v1 = new AddIndexVisitor();


        com.accept(v);
        com.accept(v1);
        com.accept(v2);

        com.showHierarchy();
    }
}
