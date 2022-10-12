
public class CustomerManager {
	
	private Customer customer;
	private CreditManagerInterface creditManager;
	
	/*
	 * CreditManagerInterface referans tipi. Her kim bu interfacei 
	 * implemente ediyorsa bu interface onlarýn da referansýný tutabilir. 
	 * Böylece GiveCredit'te interfacei kullanabiliriz.
	 */
	public CustomerManager(Customer customer, CreditManagerInterface creditManager) {
		customer = this.customer;
		creditManager = this.creditManager;
	}
	
	public void Save(Customer customer) {
		System.out.println("Müþteri kaydedildi : ");
	}
	
	public void Delete(Customer customer) {
		System.out.println("Müþteri silindi : ");
	}
	
	public void GiveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}

}
