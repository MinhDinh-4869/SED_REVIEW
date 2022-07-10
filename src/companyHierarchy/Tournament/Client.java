package companyHierarchy.Tournament;

public class Client {
    public static void main(String[] args)
    {
        Game g1 = new Game(new String[]{"p1", "p2"}, new int[]{2,4});
        Game g2 = new Game(new String[]{"p3", "p4"}, new int[]{1,3});

        Game g3 = new Game(new String[]{"p2", "p3"}, new int[]{1,2});
        g1.addNextGame(g3);
        g2.addNextGame(g3);

        g3.print(g3);
    }
}
