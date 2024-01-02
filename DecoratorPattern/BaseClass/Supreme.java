package BaseClass;

public class Supreme extends BasePizza{
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return "Supreme" + " (" + this.cost() + ")";
    }
}
