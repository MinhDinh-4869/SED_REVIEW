package state.exercise;

public class Client {
    public static void main(String args[]) {
        System.out.println("Keyboard");
        System.out.println("===============");

        Keyboard keyboard = new Keyboard();

        keyboard.tap(Key.Q);

        //keyboard.tap(Key.CAPS_LOCK);
        keyboard.hold(Key.FN);
        keyboard.tap(Key.F12);
        keyboard.tap(Key.F11);

        keyboard.unhold(Key.FN);
        keyboard.tap(Key.F11);

        keyboard.hold(Key.FN);
        keyboard.hold(Key.SHIFT);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.F11);
        keyboard.tap(Key.F12);

    }
}
