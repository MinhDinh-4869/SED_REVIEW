package visitor.optionA;

public interface Visitor {
    void visit(Mouse m);
    void visit(Computer c);
    void visit(BluetoothMouse b);
}
