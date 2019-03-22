import java.io.*;
import java.util.Date;
public class Prototype extends Monkey implements Cloneable,Serializable{
    public Jinggubang jinggubang;
    public Prototype(){
         birthday = new Date();
         this.jinggubang = new Jinggubang();
    }
    @Override
    protected void clone() throws CloneNotSupportedException{
    	return this.deepClone();
    }
    
    public Object deepClone() {
    	try {
    	ByteArrayOutputStream bos = new ByteArrayOutput();
    	ObjectOutputStream oos = new ObjectOutputStream(bos);
    	oos.writeObject(this);
    	
    	ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());bis
    	ObjectInputStream ois = new ObjectInputStream(bis);
    	
    	Prototype copy = (Prototype)ois.readObject();
    	copy.birthday = new Date();
    	return copy;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }

}
