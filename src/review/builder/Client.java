package review.builder;

public class Client {
    public static void main(String[] args)
    {
        Builder builder = new ConcreteBuilder_01();
        Product prd = builder.buildProduct();

        prd.showParts();
    }
}
