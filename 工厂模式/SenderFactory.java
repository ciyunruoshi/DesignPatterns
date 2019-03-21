public class SenderFactory extends AbstractFactory {
    @Override
    public Sender createBluetoothSender(){
        return new BuletoothSender();
    }

    @Override
    public Sender createWifiSender(){
        return new WifiSender();
    }
}
