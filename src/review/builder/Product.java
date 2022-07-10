package review.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    //use a default constructor
    Part_01 part_01;
    Part_02 part_02;

    //Complex Constructor for Product, avoid this if the client need a Product
    public Product(Part_01 part_01, Part_02 part_02)
    {
        this.part_01 = part_01;
        this.part_02 = part_02;
    }

    public void showParts()
    {
        part_01.showName();
        part_02.showName();
    }
}
