package review.interator;

import java.util.ArrayList;
import java.util.List;

public class Container {
    List<String> names;
    public Container()
    {
        names = new ArrayList<>();
        names.add("Minh");
        names.add("Minh_01");
        names.add("Minh_02");
        names.add("Minh_03");
    }

    public Iterator getIterator()
    {
        return new ConcreteIterator_01();
    }

    class ConcreteIterator_01 implements Iterator
    {
        static int index = 0;

        public Object next()
        {
            Object nextObject = null;
            if(hasNext())
            {
                nextObject = names.get(index);
                index++;
            }
            return nextObject;
        }

        public boolean hasNext()
        {
            return index < names.size();
        }
    }
}
