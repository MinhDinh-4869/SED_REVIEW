package observer.B;

public abstract class Observer {
    protected Subject s;
    public Observer(Subject s)
    {
        this.s = s;
    }
    public abstract void update();
}
