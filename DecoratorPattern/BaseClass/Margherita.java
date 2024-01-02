package BaseClass;

public class Margherita extends BasePizza{
    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String description() {
        return "Margherita" + " (" + this.cost() + ")";
    }
}
