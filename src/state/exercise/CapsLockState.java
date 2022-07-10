package state.exercise;

public class CapsLockState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch (K)
        {
            case CAPS_LOCK:
                System.out.println("Q");
                break;
            case Q:
                KB.setState(new InitState());
                KB.tap(K);
                break;
            default:
                System.out.println("No function");
        }
    }

    public void hold(Keyboard KB, Key K)
    {
        switch(K)
        {
            case SHIFT :
                KB.setState(new HoldShiftState());
                break;
            case FN:
                KB.setState(new HoldFnCapsLockState());
                break;
            default:
                ;
        }
    }
    public void unhold(Keyboard KB, Key K){}
}
