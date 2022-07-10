package visitor;

public class Client {
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        Computer computer1 = new Computer();
        computer.display();

        computer.add(new Monitor());
        computer.add(new Keyboard());
        computer.add(new Mouse());

        computer1.add(new Mouse());
        computer1.add(new Keyboard());

        computer.add(computer1);

        System.out.println(computer.count());
        System.out.println(computer.calculatePrice());

    }
}
