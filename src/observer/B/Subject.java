package observer.B;

public interface Subject {
    public void startProcess();
    public void attach(Observer o);
    public String getState();
}
