package review.builder;

public class ConcreteBuilder_01 implements Builder{
    public Product buildProduct()
    {
        //Build product via concrete Builder
        return new Product(new Part_01(), new Part_02());
    }
}
