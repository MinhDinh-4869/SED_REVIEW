package observer.A;

public class ToUpperSource implements InlineSource{
    public void update(String line)
    {
        System.out.println(line.toUpperCase());
    }
}
