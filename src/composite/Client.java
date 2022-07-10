package composite;


public class Client {
    public static void main(String[] args)
    {
        Leaf l1 = new Leaf("p1", "p2", 2,4);
        Leaf l2 = new Leaf("p3", "p4", 1,3);
        Composite b1 = new Composite("p2", "p4", 0,1);
        b1.add(l1);
        b1.add(l2);

        Leaf l3 = new Leaf("p5", "p6", 0,5);
        Leaf l4 = new Leaf("p7","p8", 6,2);
        Composite b2 = new Composite("p6", "p7", 2,0);

        b2.add(l3);
        b2.add(l4);

        Composite b3 = new Composite("p4", "p6", 2,3);
        b3.add(b1);
        b3.add(b2);
        b3.print();
        System.out.println(b3.check());
    }
}
