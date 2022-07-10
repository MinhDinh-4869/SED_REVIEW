package companyHierarchy.option1;

public class Client {
    public static void main(String[] args)
    {
        LinkedList vgu = null;
        LinkedList build = new LinkedList();
        vgu = build.insert(null, "President");
        vgu = build.insert(vgu, "Dean");
        vgu = build.insert(vgu, "Lecturer");

        vgu.printList(vgu);
    }
}
