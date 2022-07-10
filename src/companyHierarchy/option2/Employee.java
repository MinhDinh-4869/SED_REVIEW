package companyHierarchy.option2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private final List<Employee> supervisee = new ArrayList<Employee>();

    public Employee(String name, String dept, int salary)
    {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void addSupervisee(Employee e)
    {
        this.supervisee.add(e);
    }
    public void show()
    {
        if (this.supervisee.size() == 0)
        {
            ; //done
        }
        else
        {
            for(Employee e : this.supervisee)
            {
                System.out.println(e.name +" | "+ e.dept +" | "+ e.salary);
                e.show();
            }
        }
    }

    public void showFull()
    {
        System.out.println(this.name +" | "+ this.dept +" | "+ this.salary);
        this.show();
    }
}
