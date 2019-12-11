public class Account{
	private String name;
	private double balance;
	private String type;
	private boolean isActive;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}
	public boolean getIsActive(){
		return isActive;
	}
}