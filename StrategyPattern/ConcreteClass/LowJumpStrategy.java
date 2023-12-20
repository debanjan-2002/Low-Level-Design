package ConcreteClass;

import Strategy.IJumpStrategy;

public class LowJumpStrategy implements IJumpStrategy {
    final int height = 2;
    @Override
    public void jump() {
        System.out.println("Low jump! " + "(" + this.height + " meters)");
    }
}
