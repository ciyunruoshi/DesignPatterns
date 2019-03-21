public class HandleA extends AbstractHandler{
    @Override
    public void handleRequest(String condition){
        if(condition.equals("A")){
            System.out.println("ConcreteHandlerA");
        }else{
            System.out.println("ConcreteHandlerA do not");
            super.getNextHandler().handleRequest(condition);
        }
    }
}