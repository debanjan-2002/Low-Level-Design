package BaseClass;

public class Pepperoni extends BasePizza{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Pepperoni" + " (" + this.cost() + ")";
    }
}
