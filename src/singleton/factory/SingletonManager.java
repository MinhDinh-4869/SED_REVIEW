package singleton.factory;

public class SingletonManager {
    private static Singleton INSTANCE = null;
    public Singleton getInstance()
    {
        if (INSTANCE == null)
        {
            synchronized (Singleton.class)
            {
                if (INSTANCE == null)
                {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
