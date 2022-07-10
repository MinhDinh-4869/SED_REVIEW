package review.composite.optionA;

public class Client {
    public static void main(String[] args)
    {
        Composite c0 = new Component("Minh");
        Composite c1 = new Component("Minh but more stupid 01");
        Composite c2 = new Component("Minh but more stupid 02");
        Composite c3 = new Component("Minh but much more stupid 01-01");

        c0.add(c1);
        c0.add(c2);
        c1.add(c3);

        c0.showTree();
    }
}
