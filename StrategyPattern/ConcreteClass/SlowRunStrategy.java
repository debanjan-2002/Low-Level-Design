package ConcreteClass;

import Strategy.IRunStrategy;

public class SlowRunStrategy implements IRunStrategy {
    final int speed = 5;
    @Override
    public void run() {
        System.out.println("Slow speed! " + "(" + this.speed + " km/hr)");
    }
}
