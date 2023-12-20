import ConcreteClass.FastRunStrategy;
import ConcreteClass.LowJumpStrategy;

public class Fighter1 extends Fighter{
    Fighter1() {
        super(new FastRunStrategy(), new LowJumpStrategy());
    }
}
