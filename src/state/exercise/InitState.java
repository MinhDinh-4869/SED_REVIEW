package state.exercise;

public class InitState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case Q:
                System.out.println("q");
                break;
            case CAPS_LOCK:
                KB.setState(new CapsLockState());
                KB.tap(K);
                break;
            default:
                System.out.println("No function");
        }
    }

    public void hold(Keyboard KB, Key K)
    {
        switch (K)
        {
            case SHIFT:
                KB.setState(new HoldShiftState());
                break;
            case FN:
                KB.setState(new HoldFnState());
            default:
                ;
        }
    }

    public void unhold(Keyboard KB, Key K){}
}
