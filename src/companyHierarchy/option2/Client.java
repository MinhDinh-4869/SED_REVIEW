package companyHierarchy.option2;

public class Client {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Minh", "President", 10);
        Employee e2 = new Employee("Minh but stupid", "Dean", 1);
        Employee e3 = new Employee("Minh but super stupid", "Lecturer", 1);
        Employee e4 = new Employee("Minh but super stupid 2", "Assistant", 1);

        e1.addSupervisee(e2);
        e2.addSupervisee(e3);
        e2.addSupervisee(e4);

        e1.showFull();

        System.out.println("----------");

        e1.show();
    }
}
