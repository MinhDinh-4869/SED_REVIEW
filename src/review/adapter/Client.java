package review.adapter;

public class Client {
    public static void main(String[] args)
    {
        Lightning iphone = new iPhone();
        Adapter a = new Adapter(iphone);

        a.usbCharging();
        a.useUSB();
    }
}
