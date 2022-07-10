package newpackage_13042022;

public class Client {
    public static void main(String[] args)
    {
        Tapper taptap = new Tapper();

        Tapper.key K = Tapper.key.CL;
        taptap.tap(K);
        taptap.tap(K);
        taptap.tap(K);
        taptap.tap(K);
    }
}
