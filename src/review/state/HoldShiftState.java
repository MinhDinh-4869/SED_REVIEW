package review.state;

public class HoldShiftState implements State{
    public void tap(Keyboard KB, Key K)
    {
        switch(K)
        {
            case Q:
                System.out.println("Q");
                break;
            case CAPSLOCK:
                KB.setState(new HoldShiftCapsLockState());
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
                KB.setState(new InitState());
                break;
            default:
                ;
        }
    }
}
