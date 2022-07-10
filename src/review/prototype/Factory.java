package review.prototype;

import java.util.Hashtable;

public class Factory {
    private static Factory INSTANCE = null;
    private static Hashtable<String, Shape> prototypes;

    private Factory()
    {
        prototypes = new Hashtable<>();
        prototypes.put("square", new Square());
        prototypes.put("circle", new Circle());
        prototypes.put("triangle", new Triangle());
    }

    public Shape getCopy(String key) throws CloneNotSupportedException {
        return prototypes.get(key).clone();
    }

    public static Factory getINSTANCE()
    {
        if(INSTANCE == null)
        {
            synchronized (Factory.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = new Factory();
                }
            }
        }
        return INSTANCE;
    }
}
