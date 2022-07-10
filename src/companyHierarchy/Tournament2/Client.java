package companyHierarchy.Tournament2;

public class Client {
    public static void main(String[] args)
    {
        Leave l1 = new Leave("p1", "p2", 2,4);
        Leave l2 = new Leave("p3", "p4", 1,3);
        Branch b1 = new Branch("p2", "p4", 0,1);
        b1 = b1.insert(l1);
        b1 = b1.insert(l2);

        Leave l3 = new Leave("p5", "p6", 0,5);
        Leave l4 = new Leave("p7","p8", 6,2);
        Branch b2 = new Branch("p6", "p7", 2,0);

        b2 = b2.insert(l3);
        b2 = b2.insert(l4);

        Branch b3 = new Branch("p4", "p6", 2,3);
        b3 = b3.insert(b1);
        b3 = b3.insert(b2);
        b3.Display();
        System.out.println(b3.Check());
    }
}
