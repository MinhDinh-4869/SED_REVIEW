package review.visitor;

public interface ComputerPart {
    void accept(Visitor v);
    String getName();
    void setLevel(int level);
    int getLevel();

}
