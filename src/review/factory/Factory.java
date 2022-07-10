package review.factory;

public class Factory {
    public static Interface getObject(int option)
    {
        Interface return_object = null;
        switch (option)
        {
            case 1:
                return_object = new Class_01();
                break;
            case 2:
                return_object = new Class_02();
                break;
            default:
                ;
        }
        return return_object;
    }
}
