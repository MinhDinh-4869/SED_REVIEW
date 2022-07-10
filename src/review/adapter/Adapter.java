package review.adapter;

public class Adapter implements USB{
    Lightning lightningDevice;

    public Adapter(Lightning lightningDevice)
    {
        this.lightningDevice = lightningDevice;
    }

    public void useUSB()
    {
        lightningDevice.useLightning();
    }

    public void usbCharging()
    {
        lightningDevice.lightningCharging();
    }
}
