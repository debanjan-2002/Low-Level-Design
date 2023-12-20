import ConcreteClass.HighJumpStrategy;
import ConcreteClass.SlowRunStrategy;

public class Fighter2 extends Fighter{
    Fighter2() {
        super(new SlowRunStrategy(), new HighJumpStrategy());
    }
}
