import java.io.Serializable;

public class Jinggubang implements Serializable {
    private double high=100;
    private double width=10;

    public void big(){
        this.high*=2;
        this.width*=2;
    }

    public void small(){
        this.high=this.high/2;
        this.width/=2;
    }
}
