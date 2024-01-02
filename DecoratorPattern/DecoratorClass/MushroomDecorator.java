package DecoratorClass;

import BaseClass.BasePizza;

public class MushroomDecorator extends ExtrasDecorator{
    BasePizza pizza;
    int decoratorCost;
    public MushroomDecorator(BasePizza pizza) {
        this.pizza = pizza;
        this.decoratorCost = 75;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + this.decoratorCost;
    }

    @Override
    public String description() {
        return this.pizza.description() + " + Mushroom" + " (" + this.decoratorCost + ")";
    }
}
