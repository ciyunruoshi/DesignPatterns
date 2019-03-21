import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckAuthority{

	public static void main(String[] args) {

		ManagerPPower mp = new ManagerPPower();
		DirectorPPower dp = new DirectorPPower();
		VicPersidentPPower vpp = new VicPersidentPPower();
		PresidentPPower pp = new PresidentPPower();
		mp.setSuccessor(dp);
		dp.setSuccessor(vpp);
		vpp.setSuccessor(pp);

		try {
			while (true) {
				System.out.println("Enter the amount to check who shoulf approve your expenditure");
				System.out.println(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				mp.processRequest(new PurchaseRequest(d, "General"));
			}
		} catch (IOException p) {
			System.exit(1);
		}

	}
}

abstract class PurchasePower{
	protected static final double BASE = 50;
	protected PurchasePower successor;

	abstract protected double getAllowable();
	abstract protected String getRole();

	public void setSuccessor(PurchasePower successor){
		this.successor = successor;
	}

	public void processRequest(PurchaseRequest request){
		if(request.getAmount()<this.getAllowable()){
			System.out.println(this.getRole()+"will approve$"+request.getAmount());
		}else if(successor!=null){
			successor.processRequest(request);
		}
	}

}

class ManagerPPower extends PurchasePower{
	protected double getAllowable(){
		return BASE*10;
	}

	protected String getRole(){
		return "Manager";
	}
}

class DirectorPPower extends PurchasePower{
	protected double getAllowable(){
		return BASE*20;
	}

	protected String getRole(){
		return "Director";
	}
}

class VicPersidentPPower extends PurchasePower{
	protected double getAllowable(){
		return BASE*40;
	}

	protected String getRole(){
		return "VicPersident";
	}
}

class PresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}

class PurchaseRequest {
	private double amount;
	private String purpose;

	public PurchaseRequest(double amount, String purpose) {
		this.amount = amount;
		this.purpose = purpose;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double am) {
		this.amount = am;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}