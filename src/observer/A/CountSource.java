package observer.A;

public class CountSource implements InlineSource{
    public void update(String line)
    {
        System.out.println(line.length());
    }
}
