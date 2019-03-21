public abstract class AbstractHandler{
    private AbstractHandler nextHandler;
    public abstract void handleRequest(String condition);
    public AbstractHandler getNextHandler(){
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler next){
        this.nextHandler = next;
    }
}