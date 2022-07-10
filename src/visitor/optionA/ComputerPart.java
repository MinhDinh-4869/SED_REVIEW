package visitor.optionA;

public interface ComputerPart {
    void accept(Visitor v);
    void showHierarchy();
}
