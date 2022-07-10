package review.state;

public class HoldShiftCapsLockState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case Q:
                System.out.println("q");
                break;
            case CAPSLOCK:
                KB.setState(new HoldShiftState());
                break;
            case SHIFT:
            default:
                ;
        }
    }

    public void hold(Keyboard KB, Key K){}

    public void unHold(Keyboard KB, Key K){
        switch(K)
        {
            case Q:
            case CAPSLOCK:
            case SHIFT:
                KB.setState(new CapsLockState());
                break;
            default:
                ;
        }
    }
}
