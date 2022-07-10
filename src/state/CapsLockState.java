package state;

public class CapsLockState implements State{

    public void tap(Context ctx, KEYHOLDER.key K)
    {
        if(K == KEYHOLDER.key.Q)
        {
            ctx.setState(new CapsLockState());
        }
    }
}
