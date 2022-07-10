package state;

public class InitState implements State{

    private boolean flag = true;
    public void tap(Context ctx, KEYHOLDER.key K)
    {
        if(K == KEYHOLDER.key.CL)
        {
            ctx.setState(new CapsLockState());
        }
        //if no, still init state
        if(flag)
        {
            System.out.println("q");
            flag = false;
        }
        else
        {
            System.out.println("Q");
            flag = true;
        }
    }
}
