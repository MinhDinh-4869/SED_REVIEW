package review.observer;

public interface Observer {
    void attach(Subject s);
    void update();
}
