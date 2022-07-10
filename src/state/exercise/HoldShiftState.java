package state.exercise;

public class HoldShiftState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch (K)
        {
            case Q:
                System.out.println("Q");
                break;
            case CAPS_LOCK:
                System.out.println("q");
                break;
            default:
                ;
        }
    }

    public void hold(Keyboard KB, Key K) {
        switch (K)
        {
            case FN:
                KB.setState(new HoldShiftFnState());
                break;
            default:
                ;
        }
    }

    public void unhold(Keyboard KB, Key K)
    {
        switch(K)
        {
            case SHIFT:
                KB.setState(new InitState());
                break;
            default:
                ;
        }
    }
}
