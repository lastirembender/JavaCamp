
public class CustomerManager {
	
	private Customer customer;
	private CreditManagerInterface creditManager;
	
	/*
	 * CreditManagerInterface referans tipi. Her kim bu interfacei 
	 * implemente ediyorsa bu interface onlar�n da referans�n� tutabilir. 
	 * B�ylece GiveCredit'te interfacei kullanabiliriz.
	 */
	public CustomerManager(Customer customer, CreditManagerInterface creditManager) {
		customer = this.customer;
		creditManager = this.creditManager;
	}
	
	public void Save(Customer customer) {
		System.out.println("M��teri kaydedildi : ");
	}
	
	public void Delete(Customer customer) {
		System.out.println("M��teri silindi : ");
	}
	
	public void GiveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}

}
