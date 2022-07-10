package review.visitor;

public interface Visitor {
    void visit(Computer cp);
    void visit(Mouse m);
    void visit(Keyboard kb);
}
