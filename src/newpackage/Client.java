package newpackage;

public class Client {
    public static void main(String[] args)
    {
        Leave student1 = new Leave("Student1");
        Leave student2 = new Leave("Student2");
        Leave student3 = new Leave("Student3");
        Leave student4 = new Leave("Student4");

        StudentArchive sa1 = new StudentArchive("Student 5");
        StudentArchive sa2 = new StudentArchive("Student 6");

        StudentArchive sa3 = new StudentArchive("Student On Top");

        sa1.add(student1);
        sa1.add(student2);

        sa2.add(student3);
        sa2.add(student4);

        sa3.add(sa1);
        sa3.add(sa2);

        sa3.printLeftToRight();
        System.out.println();
        sa3.printRightToLeft();
    }
}
