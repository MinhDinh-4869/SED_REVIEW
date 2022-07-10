package state.exercise;

public interface State {
    public void tap(Keyboard KB, Key K);
    public void hold(Keyboard KB, Key K);
    public void unhold(Keyboard KB, Key K);
}
