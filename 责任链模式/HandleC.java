public class HandleC extends AbstractHandler {
    @Override
    public void handleRequest(String condition){
        if(condition.equals("C")){
            System.out.println("ConcreteHandlerC");
        }else{
            System.out.println("ConcreteHandlerC do not");
            super.getNextHandler().handleRequest(condition);
        }
    }
}
