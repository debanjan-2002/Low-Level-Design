package DecoratorClass;

import BaseClass.BasePizza;

public class TacoDecorator extends ExtrasDecorator{
    BasePizza pizza;
    int decoratorCost;
    public TacoDecorator(BasePizza pizza) {
        this.pizza = pizza;
        this.decoratorCost = 50;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + this.decoratorCost;
    }

    @Override
    public String description() {
        return this.pizza.description() + " + Taco" + " (" + this.decoratorCost + ")";
    }
}
