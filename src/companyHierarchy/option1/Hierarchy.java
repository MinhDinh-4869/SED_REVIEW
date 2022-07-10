package companyHierarchy.option1;

import java.util.ArrayList;
import java.util.List;

public class Hierarchy {
    List<Staff> staffs = new ArrayList<Staff>();
    public void addStaff(Staff s)
    {
        this.staffs.add(s);
    }

}
