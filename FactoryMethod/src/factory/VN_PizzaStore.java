package factory;

public class VN_PizzaStore extends PizzaStore{
	@Override
	Pizza createPizza(PizzaType p) {
		switch(p) {
			case SEAFOOD -> {
				return new VN_SeaFoodPizza();
			}
		}
		return null;
	}
}
