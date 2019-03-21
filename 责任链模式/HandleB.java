public class HandleB extends AbstractHandler {
        @Override
        public void handleRequest(String condition){
            if(condition.equals("B")){
                System.out.println("ConcreteHandlerB");
            }else{
                System.out.println("ConcreteHandlerB do not");
                super.getNextHandler().handleRequest(condition);
            }
        }
}
