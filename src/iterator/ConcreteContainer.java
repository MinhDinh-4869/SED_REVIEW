package iterator;

public class ConcreteContainer implements Container{
    //this class has the data structure
    public String[] studentList = {"Minh", "That", "La", "Ngu", "Dot"};


    public Iterator getIterator()
    {
        return new ConcreteIterator();
    }

    public boolean isGreater(String s1, String s2)
    {
        int i1 = 0;
        int i2 = 0;
        while (true)
        {
            if(s1.charAt(i1) == s2.charAt(i2))
            {
                i1++;
                i2++;
            }
            else return s1.charAt(i1) > s2.charAt(i2);
        }
    }
    public void sortList()
    {
        for(int i= 0; i< studentList.length; i++)
        {
            for(int j = i+1; j< studentList.length; j++)
            {
                if (isGreater(studentList[i], studentList[j]))
                {
                    Object o = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = (String) o;
                }
            }
        }
    }

    //The container can give the client many way of traversing by defining several Concrete Iterator
    class ConcreteIterator implements Iterator{
        static int index = 0;
        public boolean hasNext()
        {
            return index < studentList.length;
        }

        public Object next()
        {
            index++;
            return studentList[index - 1];
        }
/*
        public boolean check(Object o)
        {
            for (String s : studentList) {
                if (s.equals(o)) {
                    return true;
                }
            }
            return false;
        }

 */
    }
}
