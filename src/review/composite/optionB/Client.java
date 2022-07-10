package review.composite.optionB;

public class Client {
    public static void main(String[] args)
    {
        Composite c0 = new Component("Minh");
        Composite c1 = new Component("Minh but more stupid 01");
        Composite c2 = new Component("Minh but more stupid 02");

        Composite l1 = new Leave("Minh but much more stupid 01-01");
        Composite l2 = new Leave("Minh but much more stupid 01-02");

        Composite l3 = new Leave("Minh but much more stupid 02-01");
        Composite l4 = new Leave("Minh but much more stupid 02-02");

        c0.add(c1);
        c0.add(c2);

        c1.add(l1);
        c1.add(l2);

        c2.add(l3);
        c2.add(l4);

        c0.showTree();
    }
}
