
public class Main {

	public static void main(String[] args) {
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
		
		
	}

}