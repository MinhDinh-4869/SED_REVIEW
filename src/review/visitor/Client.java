package review.visitor;

public class Client {
    public static void main(String[] args)
    {
        Computer computer0 = new Computer("Computer 00");
        Computer computer1 = new Computer("Computer 01");

        ComputerPart part1 = new Mouse("Mouse 00");
        ComputerPart part2 = new Keyboard("Keyboard 00");
        ComputerPart part3 = new Mouse("Mouse 01");

        computer0.add(part1);
        computer0.add(part2);
        computer0.add(computer1);
        computer1.add(part3);

        computer0.accept(new SetLevelVisitor());
        computer0.accept(new PrintTreeVisitor());

    }
}
