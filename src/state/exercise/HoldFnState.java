package state.exercise;

public class HoldFnState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case F11:
                System.out.println("Volume Down");
                break;
            case F12:
                System.out.println("Volume Up");
                break;
            case CAPS_LOCK:
                KB.setState(new HoldFnCapsLockState());
                break;
            default:
                System.out.println("No function");
        }
    }

    public void hold(Keyboard KB, Key K)
    {
        switch(K)
        {
            case SHIFT:
                KB.setState(new HoldShiftFnState());
                break;
            default:
                ;
        }
    }

    public void unhold(Keyboard KB, Key K)
    {
        switch (K)
        {
            default:
                KB.setState(new InitState());
        }
    }
}
