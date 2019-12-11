public class AccountTest{
	public static void main (String[] args){
		//we start building main objects inside the main method which is inside the AccountTest class
		Account obj = new Account();
		obj.getName();		
		obj.setName("Deborah");
		System.out.println(obj.getName());
	}		
}