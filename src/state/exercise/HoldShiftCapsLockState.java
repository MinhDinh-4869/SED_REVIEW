package state.exercise;

public class HoldShiftCapsLockState implements State{
    public void tap(Keyboard KB, Key K) {
        switch (K)
        {
            case CAPS_LOCK:
                KB.setState(new HoldShiftState());
                break;
            default:
                ;
        }
    }

    public void hold(Keyboard KB, Key K)
    {
        switch (K)
        {
            case FN:
                KB.setState(new HoldFnShiftCapsLockState());
                break;
            default:
                ;
        }
    }

    public void unhold(Keyboard KB, Key K)
    {
        switch (K)
        {
            case SHIFT:
                KB.setState(new CapsLockState());
                break;
            default:
                ;
        }
    }
}
