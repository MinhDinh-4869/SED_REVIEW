package review.state;

//subject class
public class Keyboard {
    State state = new InitState();

    public void setState(State state)
    {
        this.state = state;
    }

    public void tap(Key K)
    {
        state.tap(this, K);
    }

    public void hold(Key K)
    {
        state.hold(this, K);
    }

    public void unHold(Key K)
    {
        state.unHold(this, K);
    }
}
