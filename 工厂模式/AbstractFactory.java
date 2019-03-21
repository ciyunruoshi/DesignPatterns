/*
*
* */
public abstract class AbstractFactory {
    public abstract Sender createBluetoothSender();

    public abstract Sender createWifiSender();

}
