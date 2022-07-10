package newpackage_13042022;

import java.util.HashMap;
import java.util.Locale;

public class Tapper {
    public enum key{Q, CL};
    private boolean flag = false;
    private boolean capsLockFlag = false;
    public void tap(key K)
    {
        if (K == key.Q)
        {
            if(flag)
            {
                System.out.println("Q");
                flag = false;
            }
            else
            {
                System.out.println("q");
                flag = true;
            }
        }
        else if(K == key.CL)
        {
            System.out.println("Q");
        }
    }
}
