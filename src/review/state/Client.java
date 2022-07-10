package review.state;

public class Client {
    public static void main(String[] args)
    {
        Keyboard kb = new Keyboard();

        kb.tap(Key.Q);
        //kb.tap(Key.CAPSLOCK);
        kb.hold(Key.SHIFT);
        kb.tap(Key.CAPSLOCK);
        kb.tap(Key.CAPSLOCK);
        kb.tap(Key.Q);
    }
}
