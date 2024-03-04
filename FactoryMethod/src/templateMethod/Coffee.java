package templateMethod;

public class Coffee extends CaffeinBeverage{
	@Override
	protected void brew() {
		System.out.println("Cho bột cf vào nước sôi khoáy đều");
	}
	
	@Override
	protected void addCondiment() {
		System.out.println("Cho thêm ít sữa ông thọ");
	}
	
	@Override
	protected void pourTea() {
		System.out.println("Tặng thêm cốc trà đá");
	}
}
