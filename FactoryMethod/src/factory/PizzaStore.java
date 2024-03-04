package factory;

public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType p);

    public Pizza orderPizza(PizzaType p) {
        Pizza pizza = createPizza(p);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

