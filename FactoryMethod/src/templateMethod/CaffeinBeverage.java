package templateMethod;

public abstract class CaffeinBeverage {
	
	protected abstract void brew();
	protected abstract void addCondiment();
	protected abstract void pourTea();
	
	private void boilWater() {
		System.out.println("Đun sôi nước ở 100 độ C");
	}
	
	private void pourInCup() {
		System.out.println("Rót vào cốc");
	}
	
	private void pay() {
		System.out.println("Thanh toán 24.000 vnđ");
	}
	
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
		pourTea();
		pay();
	}
}
