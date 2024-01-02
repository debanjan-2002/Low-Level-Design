package DecoratorClass;

import BaseClass.BasePizza;

public class CheeseDecorator extends ExtrasDecorator{
    BasePizza pizza;
    int decoratorCost;
    public CheeseDecorator(BasePizza pizza) {
        this.pizza = pizza;
        this.decoratorCost = 20;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + this.decoratorCost;
    }

    @Override
    public String description() {
        return this.pizza.description() + " + Cheese" + " (" + this.decoratorCost + ")";
    }
}
