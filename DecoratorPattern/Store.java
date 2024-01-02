import BaseClass.BasePizza;
import BaseClass.Margherita;
import BaseClass.Pepperoni;
import BaseClass.Supreme;
import DecoratorClass.CheeseDecorator;
import DecoratorClass.MushroomDecorator;

public class Store {
    public static void main(String[] args) {
        // Base Pizza: Margherita
        // Extras: None
        BasePizza pizza1 = new Margherita();
        // Base Pizza: Pepperoni
        // Extras: Cheese
        BasePizza pizza2 = new CheeseDecorator(new Pepperoni());
        // Base Pizza: Supreme
        // Extras: Cheese + Mushroom
        BasePizza pizza3 = new CheeseDecorator(new MushroomDecorator(new Supreme()));

        System.out.println("Pizza : " + pizza1.description());
        System.out.println("Cost : " + pizza1.cost());

        System.out.println("Pizza : " + pizza2.description());
        System.out.println("Cost : " + pizza2.cost());

        System.out.println("Pizza : " + pizza3.description());
        System.out.println("Cost : " + pizza3.cost());
    }
}
