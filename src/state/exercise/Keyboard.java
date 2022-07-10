package state.exercise;

public class Keyboard {
    //The Context has only one state field!
    private State state = new InitState();

    public void tap(Key K) {
        this.state.tap(this, K);
    }

    public void hold(Key K)
    {
        this.state.hold(this,K);
    }

    public void unhold(Key K)
    {
        this.state.unhold(this, K);
    }

    public void setState(State state)
    {
        this.state = state;
    }
}
