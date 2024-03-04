package factory;

public class VN_SeaFoodPizza {
	@Override
	void prepare() {
		builder.append("Bột gạo, 4 con cá cơm");
	}
	
	@Override
	void bake() {
		builder.append("\n").append("Nướng trong máy nướng bánh");
	}
	
	@Override
	void cut() {
		builder.append("Cắt làm 8 miếng");
	}
	
	@Override
	void box() {
		builder.append("Đóng gói bánh Pizza vào hộp");
	}
}
