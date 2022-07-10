package review.state;

public class CapsLockState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case Q:
                System.out.println("Q");
                break;
            case CAPSLOCK:
                KB.setState(new InitState());
                break;
            case SHIFT:
            default:
                ;
        }
    }

    public void hold(Keyboard KB, Key K)
    {
        switch(K)
        {
            case Q:
            case CAPSLOCK:
            case SHIFT:
                KB.setState(new HoldShiftCapsLockState());
                break;
            default:
                ;
        }
    }

    public void unHold(Keyboard KB, Key K){}
}
