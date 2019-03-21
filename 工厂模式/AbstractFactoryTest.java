public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.createBluetoothSender();
        byte[] bytes = new byte[3];
        sender.sendData(bytes);
    }

}