public class ChainResponsibility {
    public static void main(String[] args){
        HandleA ha = new HandleA();
        HandleB hb = new HandleB();
        HandleC hc = new HandleC();
        ha.setNextHandler(hb);
        hb.setNextHandler(hc);

        ha.handleRequest("B");
    }
}
