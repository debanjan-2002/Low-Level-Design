package ConcreteClass;

import Strategy.IRunStrategy;

public class FastRunStrategy implements IRunStrategy {
    final int speed = 10;
    @Override
    public void run() {
        System.out.println("Fast speed! " + "(" + this.speed + " km/hr)");
    }
}
