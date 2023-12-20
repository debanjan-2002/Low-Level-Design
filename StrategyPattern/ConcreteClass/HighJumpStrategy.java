package ConcreteClass;

import Strategy.IJumpStrategy;

public class HighJumpStrategy implements IJumpStrategy {
    final int height = 5;
    @Override
    public void jump() {
        System.out.println("High jump! " + "(" + this.height + " meters)");
    }
}
