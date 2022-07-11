package revision.singleton;

public class Singleton {
    private static Singleton INSTANCE = null;
    private Singleton(){
        System.out.println("Singleton Instance is created");
    };
    public static Singleton getInstance()
    {
        if (INSTANCE == null)
        {
            synchronized (Singleton.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public void showInfo()
    {
        System.out.println(this);
    }
}
