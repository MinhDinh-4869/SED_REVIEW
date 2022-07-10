package prototype;

/* Factory should be in singleton */

import java.util.HashMap;
import java.util.Locale;

public class Factory {
    //Singleton implementation
    private static Factory f = null;
    private final HashMap<String, Shape> stock;
    private Factory()
    {
        stock = new HashMap<>();
        stock.put("rectangle", new Rectangle());
        stock.put("circle", new Circle());
        stock.put("square", new Square());
    }

    public static Factory getFactory()
    {
        if(f == null)
        {
            synchronized (Factory.class)
            {
                if(f == null)
                {
                    f = new Factory();
                }
            }
        }
        return f;
    }

    public Shape getInstance(String option) throws CloneNotSupportedException {
        Shape s =  stock.get(option.toLowerCase(Locale.ROOT));
        return (Shape) s.clone();
    }
}
