package review.state;

public interface State {
    void tap(Keyboard KB, Key K);
    void hold(Keyboard KB, Key K);
    void unHold(Keyboard KB, Key K);
}
