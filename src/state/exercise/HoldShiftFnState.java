package state.exercise;

public class HoldShiftFnState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case F11:
                System.out.println("Luminosity Down");
                break;
            case F12:
                System.out.println("Luminosity Up");
                break;
            case CAPS_LOCK:
                KB.setState(new HoldFnShiftCapsLockState());
                break;
            default:
                System.out.println("No function");
        }
    }

    public void hold(Keyboard KB, Key K){}
    public void unhold(Keyboard KB, Key K)
    {
       switch(K)
       {
           case SHIFT:
               KB.setState(new HoldFnCapsLockState());
               break;
           case FN:
               KB.setState(new CapsLockState());
               break;
           default:
               KB.setState(new InitState());
       }
    }
}
