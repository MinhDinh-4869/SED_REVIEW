package state;

public class Context {
    State state;
    public void setState(State state)
    {
        this.state = state;
    }
    public void tap(KEYHOLDER.key K)
    {
        state.tap(this, K);
    }
}
