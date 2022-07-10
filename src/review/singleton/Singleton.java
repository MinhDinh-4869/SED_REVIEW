package review.singleton;

public class Singleton {
    private static Singleton singletonObject = null;

    public static Singleton getObject()
    {
        if(singletonObject == null)
        {
            synchronized (Singleton.class)
            {
                if(singletonObject == null)
                {
                    singletonObject = new Singleton();
                }
            }
        }
        return singletonObject;
    }

    public void say()
    {
        System.out.println("Hello this is singleton object with address: "+ this);
    }
}
